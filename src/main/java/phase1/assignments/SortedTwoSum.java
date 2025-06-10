package phase1.assignments;

import java.util.*;

public class SortedTwoSum {
    public static List<List<Integer>> twoSum(int[] nums, int target) {

        List< List<Integer>> result = new ArrayList<>();
        if(nums != null && nums.length > 1) {
            Arrays.sort(nums);

            int left = 0, right = nums.length - 1;
            while(left < right) {
                int sum = nums[left] + nums[right];
                if(sum == target) {
                    List<Integer> interim_result = new ArrayList<>();
                    interim_result.add(nums[left]);
                    interim_result.add(nums[right]);
                    result.add(interim_result);
                    left += 1;
                    right += 1;
                } else {
                    if(sum > target) {
                        right -= 1;
                    } else {
                        left += 1;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 11, 7, 9, 3, 5, 4};
        int target = 9;

        List<List<Integer>> result = twoSum(nums, target);
        System.out.println(result);
    }
}
