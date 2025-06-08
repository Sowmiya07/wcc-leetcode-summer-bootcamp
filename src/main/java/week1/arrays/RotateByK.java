package week1.arrays;

import java.util.Arrays;

public class RotateByK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
//        rotateBF(nums, 3);
        rotateOptimal(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateOptimal(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return;
        int len = nums.length;
        k = k % len;

        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    public static void rotateBF(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return;
        int len = nums.length;
        k = k % len;
        int[] sub_nums = Arrays.copyOfRange(nums, len - k, len);
        for(int i = len - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for(int i = 0; i < k; i++) {
            nums[i] = sub_nums[i];
        }
    }

    static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start += 1;
            end -= 1;
        }
    }
}
