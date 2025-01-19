import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

    public static void main(String[] args) {

        int[] nums ={1,2,3,1,2,3};
        int k =2;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(map.containsKey(num) && i- map.get(num) <=k){
                System.out.println("true");
            }
            map.put(num,i);
        }
        System.out.println("false");
    }
}
