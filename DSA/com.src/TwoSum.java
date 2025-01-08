import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums ={2,7,11,15};
        int target =9;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int num = nums[i];
            if(map.containsKey(target-num)){
                System.out.println(new int[] {i, map.get(target - num)});
            }
            map.put(num, i);
        }
        System.out.println(new int[]{});
    }
}
