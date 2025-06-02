package week1.assignments;

public class SortedDuplicates {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int ptr = 0;

        for(int i = 1; i < nums.length; i++) {
           if(nums[i] != nums[ptr]) {
               ptr++;
               nums[ptr] = nums[i];
           }
        }

        ptr += 1;
        System.out.println(ptr);
        for (int i = 0; i < ptr; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
