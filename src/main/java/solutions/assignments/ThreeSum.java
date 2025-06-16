package solutions.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> result =  threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums != null && nums.length > 0) {
            Arrays.sort(nums);
            for(int i = 0; i < nums.length - 2; i++) {
                if(nums[i] > 0)
                    break;
                if(i > 0 && nums[i] == nums[i - 1])
                    continue;
                int left = i + 1, right = nums.length - 1;
                while(left < right) {
                    int sum = nums[left] + nums[right] + nums[i];
                    if(sum == 0) {
                        List<Integer> interim_result = new ArrayList<>();
                        interim_result.add(nums[i]);
                        interim_result.add(nums[left]);
                        interim_result.add(nums[right]);
                        result.add(interim_result);
                        while(left < right && nums[left + 1] == nums[left]) {
                            left += 1;
                        }
                        while(left < right && nums[right - 1] == nums[right]) {
                            right -= 1;
                        }
                        left += 1;
                        right -= 1;
                    } else {
                        if(sum > 0) {
                            right -= 1;
                        } else {
                            left += 1;
                        }
                    }
                }
            }
        }
        return result;
    }
}
