public class FindThePeakElementBruteForce {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,5,1};
        int n = arr.length;
        int peakElement = searchPeakElement(arr,n);
        System.out.println("======  "+peakElement);
    }

    //Time Complexity Big O of N O(N)
    private static int searchPeakElement(int[] arr, int n) {

        for(int i=0;i<n;i++){

            if(((i==0) || (arr[i-1] < arr[i])) && (i == n-1 || (arr[i] > arr[i+1])))
                return i;
        }
        return -1;
    }
}
