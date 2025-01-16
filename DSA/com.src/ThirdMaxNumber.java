public class ThirdMaxNumber {

    public static void main(String[] args) {

        int[]nums = {3,2,1};
        Integer first = null, second = null, third = null;
        for(int num : nums){
            if ((first != null && num == first) || (second != null && num == second) || (third != null && num == third)) {
                continue;
            }
            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }
        // If third is still null, return the largest number
        if (third == null) {
            System.out.println(first); // Return the maximum number
        }

        System.out.println(third);
    }
}
