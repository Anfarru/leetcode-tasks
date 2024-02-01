import java.util.Arrays;

public class MergeSortedArray {

    //Merges two sorted arrays into the first one and sorts it
    static void merge(int[] nums1, int m, int[] nums2, int n){
        for(int i = m, j = 0; j < n; i++, j++){
            nums1[i] = nums2[j];
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{7, 10, 15, 33, 0, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 12, 36};
        int n = nums2.length;
        int m = nums1.length - n;

        merge(nums1, m, nums2, n);

        for(int el : nums1){
            System.out.printf("%d ", el);
        }
    }
}
