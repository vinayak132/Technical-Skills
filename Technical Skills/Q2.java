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



// Step 1: Read the array and find the lenght
// Step 2: Create a prefix sum array and store the cumulative sum of array
// Step 3: Initialize count to 0
// Step 4: Calculate the left sum of array 
// Step 5: Calculate the right sum of array
// Step 6: Compare 


// Logic
// if i==0 

// 
public class Q2 {

    public static void main(String[] args) {
        int arr[]={-3,2,4,-1};
        int arrlen=arr.lenght;
        int prefix[]=new int[arr];
        int count=0;
        for(int i=0;i<arrlen;i++){
            prefix[i]=prefix[i]-prefix[i-1]
        }

        for(int i=0; i<arrlen; i++){
            
        }
        
        

    }
}