import java.util.*;

// ------------------------- Enums -------------------------
enum Direction {
    UP, DOWN, IDLE
}

enum DoorState {
    OPEN, CLOSED
}

// ------------------------- Interfaces -------------------------
interface Button {
    void press();
    boolean isPressed();
}

interface ElevatorMotion {
    void moveTo(int destinationFloor);
    void stop();
}

interface Dispatcher {
    void addRequest(int floor, Direction direction);
    void assignElevator(Elevator elevator);
}

// ------------------------- Request Classes -------------------------
class Request {
    int floor;
    Direction direction;
    long timestamp; // For aging / starvation prevention

    Request(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
        this.timestamp = System.currentTimeMillis();
    }
}

class RequestNode {
    Request request;
    RequestNode prev;
    RequestNode next;

    RequestNode(Request request) {
        this.request = request;
    }
}

// ------------------------- Door Class -------------------------
class Door {
    private DoorState state = DoorState.CLOSED;

    public void open() {
        state = DoorState.OPEN;
        System.out.println("Door opened");
    }

    public void close() {
        state = DoorState.CLOSED;
        System.out.println("Door closed");
    }

    public boolean isOpen() {
        return state == DoorState.OPEN;
    }
}

// ------------------------- Elevator Class -------------------------
class Elevator implements ElevatorMotion {
    private int currentFloor = 0;
    private Direction direction = Direction.IDLE;
    private Queue<Integer> requests = new LinkedList<>();
    private Door door = new Door();

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void addRequest(int floor) {
        if (!requests.contains(floor)) {
            requests.offer(floor);
        }
    }

    @Override
    public void moveTo(int destinationFloor) {
        while (currentFloor != destinationFloor) {
            direction = (destinationFloor > currentFloor) ? Direction.UP : Direction.DOWN;
            currentFloor += (direction == Direction.UP) ? 1 : -1;
            System.out.println("Elevator at floor " + currentFloor);
        }
        stop();
    }

    @Override
    public void stop() {
        direction = Direction.IDLE;
        door.open();
        // simulate passenger entering/exiting
        door.close();
    }

    public void step() {
        if (!requests.isEmpty()) {
            int next = requests.poll();
            moveTo(next);
        }
    }
}

// ------------------------- Smart Dispatcher Class -------------------------
class SmartDispatcher implements Dispatcher {

    // HashMap for O(1) lookup by floor
    private Map<Integer, RequestNode> floorToNodeMap = new HashMap<>();

    // Doubly linked list for maintaining request order
    private RequestNode head;
    private RequestNode tail;

    // List of elevators
    private List<Elevator> elevators = new ArrayList<>();

    @Override
    public void assignElevator(Elevator elevator) {
        elevators.add(elevator);
    }

    @Override
    public void addRequest(int floor, Direction direction) {
        if (floorToNodeMap.containsKey(floor)) return; // avoid duplicates

        Request request = new Request(floor, direction);
        RequestNode node = new RequestNode(request);

        // Add to DLL
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        // Add to HashMap for fast lookup
        floorToNodeMap.put(floor, node);
    }

    // Dispatch pending requests to elevators
    public void dispatch() {
        RequestNode current = head;
        while (current != null) {
            Elevator bestElevator = null;
            int minDistance = Integer.MAX_VALUE;

            // Find nearest elevator
            for (Elevator elevator : elevators) {
                int distance = Math.abs(elevator.getCurrentFloor() - current.request.floor);
                if (distance < minDistance) {
                    minDistance = distance;
                    bestElevator = elevator;
                }
            }

            if (bestElevator != null) {
                bestElevator.addRequest(current.request.floor);
                RequestNode next = current.next;
                removeNode(current);
                current = next;
            } else {
                current = current.next;
            }
        }
    }

    private void removeNode(RequestNode node) {
        floorToNodeMap.remove(node.request.floor);

        if (node.prev != null) node.prev.next = node.next;
        else head = node.next;

        if (node.next != null) node.next.prev = node.prev;
        else tail = node.prev;

        node.prev = node.next = null; // clean up
    }

    public boolean hasPendingRequests() {
        return !floorToNodeMap.isEmpty();
    }
}

// ------------------------- Driver Code -------------------------
public class ElevatorSystem {
    public static void main(String[] args) throws InterruptedException {
        SmartDispatcher dispatcher = new SmartDispatcher();

        Elevator e1 = new Elevator();
        Elevator e2 = new Elevator();

        dispatcher.assignElevator(e1);
        dispatcher.assignElevator(e2);

        // Simulate passengers pressing hall buttons
        dispatcher.addRequest(5, Direction.UP);
        dispatcher.addRequest(10, Direction.DOWN);
        dispatcher.addRequest(3, Direction.UP);
        dispatcher.addRequest(12, Direction.DOWN);

        // Dispatch loop
        while (dispatcher.hasPendingRequests()) {
            dispatcher.dispatch();
            e1.step();
            e2.step();
        }

        System.out.println("All requests handled!");
    }
}
