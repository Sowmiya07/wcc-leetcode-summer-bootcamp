package solutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int majorBF = majorityElementBruteForce(nums);
        int majorOpt= majorityElementOptimized(nums);

        System.out.printf("BF major %d and Optimized major %d", majorBF, majorOpt);
    }

    public static int majorityElementBruteForce(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int last_max_val = 0;
        int last_max_key = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int val = entry.getValue();
            if(val > last_max_val) {
                last_max_val = val;
                last_max_key = entry.getKey();
            }
        }
        return last_max_key;
    }

    public static int majorityElementOptimized(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int major = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                major = num;
            }
            if (num == major) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return major;
    }
}
