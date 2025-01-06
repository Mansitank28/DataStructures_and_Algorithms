//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class RemoveDuplicates {
    public RemoveDuplicates() {
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = 0;
        int[] var3 = nums;
        int var4 = nums.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            int n = var3[var5];
            if (i < 1 || n > nums[i - 1]) {
                nums[i] = n;
                ++i;
            }
        }

        System.out.println(i);
    }
}
