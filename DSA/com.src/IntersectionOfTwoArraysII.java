import java.util.*;

public class IntersectionOfTwoArraysII {


    public static void main(String[] args) {
//
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        //list to store the intersection element
        List<Integer> resultList = new ArrayList<>();
        for(int num : nums2){
            if(map.containsKey(num) && map.get(num)>0){
                resultList.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        System.out.println(Arrays.toString(result));


    }
}
