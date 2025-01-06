public class MergeSortedArray {

    public static void main(String[] args) {

        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m=3, n=3;

        int mid = m - 1;
        int nid = n - 1;
        int num1end_index = m + n - 1;

        while (nid >= 0) {
            if (mid >= 0 && nums1[mid] > nums2[nid]) {
                nums1[num1end_index] = nums1[mid];
                mid--;
                // num1end_index--;
            } else {
                nums1[num1end_index] = nums2[nid];
                nid--;
            }
            num1end_index--;
        }
    }
}
