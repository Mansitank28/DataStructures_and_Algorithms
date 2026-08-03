public class FindThePeakElementBSoptimised {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,5,1};
        int n= arr.length;
        int peakElement = searchPeakElement(arr,n);
        System.out.println("==== "+peakElement);
    }

    private static int searchPeakElement(int[] arr, int n) {

        if(n==1) return 0; //First index element; left side -Infine is there
        if(arr[0] > arr[1]) return 0; //First index with 1 index greter or not checking(right side check)
        if(arr[n-1] > arr[n-2]) return n-1; //last index checking  with left side greater or not
        //now mid all element apply BS -- shrink  the element so multiple edge case avoid

        int low =1, high = n-2;
        while(low <= high){

            int mid = (low+high) /2;

            //now check mid element peak element or not
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return mid;

            //if above not true then we need to check increasing curv or not
            else if(arr[mid] > arr[mid-1])
                low = mid+1; // this is increase side so low will move to right side
            else
                high = mid -1; //this is decreasing curv so move to left side
        }

        return -1;
    }
}
