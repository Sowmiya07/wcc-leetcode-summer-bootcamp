package solutions.assignments;

import java.util.HashMap;
import java.util.Map;

public class UnsortedTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        if(nums != null && nums.length > 1) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if(map.containsKey(diff)) {
                    int idx = map.get(diff);
                    result[0] = idx;
                    result[1] = i;
                } else {
                    map.put(nums[i], i);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 11, 9, 7};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
