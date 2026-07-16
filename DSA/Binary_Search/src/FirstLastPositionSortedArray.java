public class FirstLastPositionSortedArray {

    public static void main(String[] args) {

        //Example 1:
        //
        //Input: nums = [5,7,7,8,8,10], target = 8
        //Output: [3,4]

        //Time complexity LB ->  logarithmic base 2 to n O(log2n)
        //Time complexity UB ->  logarithmic base 2 to n O(log2n)
        //2*O(log2n) logarithmic base 2 n
        //Space complexity O(1)
        int[] arr = {5,7,7,8,8,10};
        int target =8;
        int[] res = searchRange(arr,target);
        for(int i =0;i<=res.length-1;i++){
            System.out.println(res[i]);

        }
//time complexity big o of(n)  = o(n)
    }
    public static int[] searchRange(int[] nums, int target) {

        int lb = lowerBound(nums, target, nums.length);
        if(lb == nums.length || nums[lb] != target)// if lb element same  or element not found
            return new int[]{-1,-1};

        return new int[]{lb, upperBound(nums, target, nums.length) - 1};
    }

    private static int lowerBound(int[] nums, int target, int n) {
        int low = 0,high = n-1;
        int ans = n;
        while(low <= high){

            int mid = (low+high) /2;
            if(nums[mid] >= target){
                    ans = mid;
                    // look for more small index  left side
                    high  = mid - 1;
            }else
                low = mid +1; // lok for right side
        }
        return ans;

    }

    private static int upperBound(int[] nums, int target, int n) {
        int low = 0,high = n-1;
        int ans = n;
        while(low <= high){

            int mid = (low+high) /2;
            if(nums[mid] > target) {
                    ans = mid;
                    //look for small index left side
                    high = mid -1;
            }else
                    low = mid+1; // right side
        }
        return ans;
    }
}
