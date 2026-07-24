import static java.lang.Math.min;

public class HowManyTimesArrayRotated {

    public static void main(String[] args) {

       // int arr[] = {4,5,6,7,0,1,2};
        int arr[] = {4,5,0,1,2};

        int index = findTimesRotated(arr);
        System.out.println("mind===   "+index);
    }

    private static int findTimesRotated(int[] arr) {

        int low =0, high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while(low <= high){
            int mid =(low+high) /2;

            if(arr[low] <= arr[mid]){
                if(arr[low] <= ans){
                    index = low;
                    ans = arr[low];
                }
                //ans = min(ans, arr[low]);
                low = mid+1;
            }else {
                if(arr[mid] <= ans){
                    index = mid;
                    ans = arr[mid];
                }
                //ans = min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return index;
    }
}
