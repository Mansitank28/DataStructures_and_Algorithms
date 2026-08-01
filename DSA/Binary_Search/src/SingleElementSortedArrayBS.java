public class SingleElementSortedArrayBS {

    public static void main(String[] args) {

        int arr[] = {1,1,2,2,3,3,4,5,5,6,6};
        int n = arr.length;
        int element = singleElementArray(arr,n);
        System.out.println("Single element ---  "+element);
    }

    private static int singleElementArray(int[] arr, int n) {

        if(n==1) //Single element checking
            return arr[0];
        if(arr[0] != arr[1]) //first index
            return arr[0];
        if(arr[n-1] != arr[n-2]) // last index
            return arr[n-1];

        int low =0, high =n-2;
        while(low <= high){

            int mid = (low+high)/2;
            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]) {
                return arr[mid];
            }
            //we are in left
            if((mid % 2 == 1 && arr[mid] == arr[mid-1]) ||
                    (mid % 2 == 0 && arr[mid] == arr[mid+1]))
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }

}
