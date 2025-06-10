package phase1.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveElements {
    public static void main(String[] args) {
        int[] nums = IntStream.range(0, 10)
                .map(num -> num + 1)
                .toArray();

        System.out.println(Arrays.toString(nums));
        int[] rightNums = Arrays.copyOf(nums, nums.length);
        moveElementsRight(rightNums);
        int[] leftNums = Arrays.copyOf(nums, nums.length);
        moveElementsLeft(leftNums);
    }

    static void moveElementsRight(int[] nums) {
        if(nums.length == 0)
            return;
        for(int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = -1;
        System.out.println(Arrays.toString(nums));
    }

    static void moveElementsLeft(int[] nums) {
        if(nums.length == 0)
            return;
        for(int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length - 1] = -1;
        System.out.println(Arrays.toString(nums));
    }
}
