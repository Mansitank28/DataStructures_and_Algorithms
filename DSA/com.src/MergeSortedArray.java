//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class MergeSortedArray {
    public MergeSortedArray() {
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        int mid = m - 1;
        int nid = n - 1;

        for(int num1end_index = m + n - 1; nid >= 0; --num1end_index) {
            if (mid >= 0 && nums1[mid] > nums2[nid]) {
                nums1[num1end_index] = nums1[mid];
                --mid;
            } else {
                nums1[num1end_index] = nums2[nid];
                --nid;
            }
        }

    }
}
