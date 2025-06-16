package solutions.binarysearch;

public class SearchInRotatedArray {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return -1;
        int len = nums.length;
        int pivot = 0;
        for(int i = 1; i < len; i++) {
            if(nums[i] < nums[i-1]) {
                pivot = i;
            }
        }
        int left, right, mid;

        if(nums[len-1] >= target) {
            left = pivot;
            right = len - 1;
        } else {
            left = 0;
            right = pivot -1;
        }

        while(left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else {
                if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
