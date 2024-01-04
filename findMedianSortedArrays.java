import java.util.*;

class  findMedianSortedArrays{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] one = new int[nums1.length + nums2.length];
        double s;

        for (int i = 0; i < nums1.length + nums2.length; i += 2) {
            if (nums1[i / 2] < nums2[i / 2]) {
                one[i] = nums1[i / 2];
                one[i + 1] = nums2[i / 2];
            } else {
                one[i] = nums2[i / 2];
                one[i + 1] = nums1[i / 2];
            }
        }

        double n = nums1.length + nums2.length;
        if (n % 2 == 0) {
            s = (one[(int) (n / 2)] + one[(int) (n / 2) - 1]) / 2.0;
        } else {
            s = one[(int) (n / 2)];
        }

        return s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];

        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        findMedianSortedArrays solution = new findMedianSortedArrays();
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}
