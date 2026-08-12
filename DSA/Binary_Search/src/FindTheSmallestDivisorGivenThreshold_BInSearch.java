import java.util.Arrays;

public class FindTheSmallestDivisorGivenThreshold_BInSearch {

    public static void main(String[] args) {

        int nums[] = {1,2,5,9};
        int threshold = 6;
        int ans = divisorByGivenThreshold(nums, threshold);
        System.out.println("======== "+ans);
    }
    //Time Complexity = O(log(max(arr[]))*N where max(arr[]) = maximum element in the array, N=size of array.


    private static int divisorByGivenThreshold(int[] nums, int threshold) {

        if(nums.length > threshold) return -1;

        int ans = -1;
        int low =1 ;
        int high = Arrays.stream(nums).max().getAsInt();

        while(low <= high){
            int mid = (low+high) /2;

            if(sumOfDiv(nums, mid) <= threshold){
                ans = mid;
              high = mid-1;
            }else
                low = mid+1;
        }
        return ans;
    }

    private static int sumOfDiv(int[] nums, int div) {
        int sum =0;
        for(int num: nums){
            sum += (int) Math.ceil( (double) num/div);
        }
        return sum;
    }
}
