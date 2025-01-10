public class MajorityElement {
    public static void main(String[] args) {

        int nums[] = {2,2,1,1,1,2,2};
        int count =0, reserve=0;
        for(int i=0;i<nums.length;i++){

            if(count == 0){
                reserve = nums[i];
            }if(reserve == nums[i])
                count++;
            else
                count--;
        }
        System.out.println(reserve);
    }
}

