// Given an array count number of element having at least one element which are greater than itself.
public class Q1{
    public static void main(String[] args) {
        int arr[]={10,20,50,40,90};
        int max=arr[0];
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                count++;
            }
        }
        System.out.println(count);
    }
}


// Pseudocode
// Iterate and find the max of the array
// Iterate and get the number of elements which are not equal to max

// Observation
// For every max elements their won't be any elements greater than itself