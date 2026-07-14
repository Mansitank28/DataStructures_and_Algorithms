public class LowerBoundBinarySearch {

    /*Given a sorted array of nums and an integer x, write a program to find the lower bound of x.
The lower bound algorithm finds the first and smallest index in a sorted array
where the value at that index is greater than or equal to a given key i.e.
If no such index is found, return the size of the array.
Example 1 Input : nums= [1,2,2,3], x = 2  Output:1
Explanation: Index 1 is the smallest index such that arr[1] >= x.*/

    public static void main(String[] args) {

        int[] nums = {1,2,2,3};
        int x = 2;

        int result = searchType(nums,x);
        System.out.println("i======="+result);
    }

    private static int searchType(int[] nums, int x) {

        int low =0,high=nums.length-1;
        int ans = nums.length;
        while(low <= high){
            int mid = (low+high) / 2;

            //may be an answer or may not be  -------Possibility
            if(nums[mid] >= x){  // searching for an element
                 ans = mid;
                 high = mid-1;  //trim down the search phase
            }else
                low = mid+1;
        }
        return ans;
    }
}
