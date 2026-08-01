public class SingleElementSortedArray {

    public static void main(String[] args) {


        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};

        int element = singleElement(arr);
        System.out.println("Single Element - "+element);
    }
//Brute forse solution Time Complexity Big O of (N)  -- O(N)
     private static int singleElement(int[] arr) {
        int n= arr.length;
        for(int i=0; i <= n;i++){
                if(i==0){
                    if(arr[i]!= arr[i+1])
                        return arr[i];
                }else if(i == n-1){
                    if(arr[i] != arr[i-1])
                        return arr[i];
                }else{
                    if(arr[i]!= arr[i+1] && arr[i] != arr[i-1]){
                        return arr[i];
                    }
                }

        }
        return 0;
    }
}
