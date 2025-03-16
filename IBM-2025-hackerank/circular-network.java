/*
A circular network has n components represented as a string named components. Each component is either a 'Compute' ('C') unit or a 'Network' ('N') unit. The components are arranged in a circle, meaning the first component is adjacent to the last component.

Determine the minimum number of swaps needed to group all the Compute units together, and all the Network units together.

Example
components = "CNCN"

There are several possible solutions:

Swap indexes 1 and 2 to get 'CCNN'
Swap indexes 0 and 3 to get "NNCC"
Swap indexes 0 and 1 to get "NCCN"
Swap indexes 2 and 3 to get "CNNC"
The minimum number of moves is 1.


*/
