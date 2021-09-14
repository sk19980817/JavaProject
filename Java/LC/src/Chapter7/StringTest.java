package Chapter7;

public class StringTest {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2=nums1;
        nums2[1]=4;
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

    }
}
