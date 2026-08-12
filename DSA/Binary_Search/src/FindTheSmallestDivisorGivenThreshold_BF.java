public class FindTheSmallestDivisorGivenThreshold_BF {

    public static void main(String[] args) {

        int nums[] = {1,2,5,9};
        int threshold = 6;

        int ans = SmallestDivisor(nums, threshold);
        System.out.println("====== "+ans);
    }

    private static int SmallestDivisor(int[] nums, int threshold) {

        int n = nums.length;
        //find the maximum element in array
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
        }

        for(int d = 1; d <= max;d++){

            int sum =0;
            for(int i=0; i< n ;i++){

                sum += (int) Math.ceil((double) nums[i]/d);
            }
            if(sum <= threshold)
                return d;

        }
        return -1;
    }
}
