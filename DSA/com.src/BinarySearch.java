public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        //binary Search
        int low =0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high - low) /2;
            if(nums[mid] == target){
                System.out.println(mid);
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
