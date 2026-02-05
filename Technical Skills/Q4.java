// Given an array A check if their exist a pair (i,j)  such that array(i) + array(j) == k and i != j.
// Note: i and j are the indexes is the given sum. 


public class Q4{
    public static void main(String [] args){
        int arr[]={3,-2,1,4,3,6,8};
        int n=arr.length;
        int k=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i !=j && arr[i]+arr[j]==k){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }

        }
    }
}