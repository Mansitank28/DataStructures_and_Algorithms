public class UpperBoundBinarySearch {

    public static void main(String[] args) {

        int[] nums = {1,2,2,3};
        int x = 2;

        int result = searchType(nums,x);
        System.out.println("i======="+result);
    }
    // Time complexity is - O(log2n) Big of logarithmic base two 2 n
    private static int searchType(int[] nums, int x) {

        int low =0,high=nums.length-1;
        int ans = nums.length;
        while(low <= high){
            int mid = (low+high) / 2;

            //may be an answer or may not be  -------Possibility
            if(nums[mid] > x){  //this only change it is > only
                ans = mid;
                high = mid-1;  //trim down the search phase
            }else
                low = mid+1;
        }
        return ans;
    }
}
