// Given an integer array of size n in one sec you can increase the value of 1 element by 1. 
// find the minimum time in sec to make all elements of the array equal.

public class Q3{
    public static void main(String []args){ 
        int a[]={2,3,5,6,4};
        int max=a[i];
        int n=a.lenght;
        int time=0
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int i=0;i<n;i++){
            time=time+(max-a[i]);
        }
        System.out,println(time);
    }
}
// Observation
// To minimize time make all elements elements equal to the maximum of the array


// 
// Step 1 : Find the maximum element in the array.
// Step 2 : For every element calculate how much it need to be increase to reach the maximum.
// Step 3 : Sum all those differences. 