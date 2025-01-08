import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {

        boolean result = false;
        int[] nums = {1,2,3,1};
        Arrays.sort(nums);
        for(int i =1; i<nums.length;i++) {
            if(nums[i] == nums[i-1])
                System.out.println(true);
        }
        System.out.println(result);
    }
}
