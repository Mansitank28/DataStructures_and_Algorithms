
public class SearchXInSortedArrayBinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,0};
        int target = 9;

        int result = search(nums,target);
        System.out.println("i======="+result);
    }
// Time complexity is - O(log2n) Big of logarithmic base two 2 n
    private static int search(int[] nums, int target) {

        int low=0,high = nums.length-1;

        while(low <= high){

            int mid = (low+high) /2;
            if(nums[mid] == target)
                return mid;
            else if(target > nums[mid])
                low = mid+1;
            else
                high = mid -1;
        }
        return -1;
    }
}
