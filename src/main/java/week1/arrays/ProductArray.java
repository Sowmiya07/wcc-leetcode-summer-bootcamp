package week1.arrays;

import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
//        int[] answer = productExceptSelfBF(nums);
        int[] answer = productExceptSelfOptimal(nums);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] productExceptSelfBF(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            int prod = 1;
            for(int j = 0; j < len; j++) {
                if(i == j)
                    continue;
                prod *= nums[j];
            }
            answer[i] = prod;
        }
        return answer;
    }

    public static int[] productExceptSelfOptimal(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];

        answer[0] = 1;
        for(int i = 1; i < len; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for(int i = len - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix = suffix * nums[i];
        }
        return answer;
    }
}
