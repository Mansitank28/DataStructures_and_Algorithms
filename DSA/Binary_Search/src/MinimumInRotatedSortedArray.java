import static java.lang.Math.min;

public class MinimumInRotatedSortedArray {

    public static void main(String[] args) {

       // int arr[] = {4,5,6,7,0,1,2,3};
        int arr[] = {4,5,1,2,3};

        int ans = findMin(arr);
        System.out.println("mind===   "+ans);
    }

    private static int findMin(int[] arr) {

        int low = 0, high = arr.length-1;
        int ans = Integer.MAX_VALUE;

        while(low <= high){

            int mid = (low + high)/2;
            //search the space is already sorted
            //then always arr[low] is will be smaller
            //in that search space
            if(arr[low] <= arr[high]){

                ans = min(ans, arr[low]);
                break;
            }
            if(arr[low] <= arr[mid]){
                ans = min(ans, arr[low]);
                low = mid+1;
            }else{
                ans = min(ans, arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}
