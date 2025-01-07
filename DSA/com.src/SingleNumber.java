public class SingleNumber {

    public static void main(String[] args) {

        int[] nums ={4,1,2,1,2};
        int temp =0;
        for(int n : nums){
            temp = n ^ temp;
        }
        System.out.println(temp);
    }
}
