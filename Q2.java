// Q2. Equilibrium Index 
// Given N array elements, Count no of Equilibrium Index
// An Index is said to be Equilibrium Index if 
// Sum of all elements left of ith index = sum of all elements right of ith index.

// Example :-   
// index:    0  1  2  3   
// arr[4] = -3  2  4  -1
// left :   0  -3 -1  3
// right:   5  3  -1  0



// array    -7  1  5  2  -4  3 0
// left:    0  -7 -6 -1  1  -3 0
// right:   7   6  1 -1  3   0 0


// array  3 -2 2
// left   0  3 1
// right  0  2 0


// array 3 -1 2 -1 1 2 1
// left  0  3 2  4 3 4 6
// right 4  5 3  4 3 1 0 



// prefix array
// index        0   1   2   3
// ex  array:  -3   2   4  -1
//             -3  -1   4  -1
//              0  -3  -1   3
//              5   3  -1   0


// 
public class Q2 {

    public static void main(String[] args) {
        int arr[]={-3,2,4,-1};

    }
}