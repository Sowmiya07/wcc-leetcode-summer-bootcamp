package solutions.binarysearch;

import org.junit.jupiter.api.Test;

public class SearchInRotatedArrayTest {

    @Test
    public void nullInput() {
        int[] nums = null;
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(nums, 0);
        assert result == -1;
    }

    @Test
    public void emptyInput() {
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(new int[]{}, 0);
        assert result == -1;
    }

    @Test
    public void noPivot() {
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(new int[]{1, 2, 3, 4, 5, 6}, 1);
        assert result == 0;
    }

    @Test
    public void pivoted() {
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        int result = searchInRotatedArray.search(new int[]{1, 2, 3, 4, 5, 6}, 3);
        assert result == 2;
    }
}
