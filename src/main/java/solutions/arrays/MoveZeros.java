package solutions.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int zero_ptr = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[zero_ptr];
                nums[zero_ptr] = tmp;
                zero_ptr += 1;
            }
        }
    }
}
