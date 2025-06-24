package solutions.hashing;

import org.junit.jupiter.api.Test;

import java.util.List;

public class GroupAnagramsTest {
    @Test
    public void nullInput() {
        List<List<String>> result = GroupAnagrams.groupAnagrams(null);
        assert result.isEmpty();
    }

    @Test
    public void emptyInput() {
        List<List<String>> result = GroupAnagrams.groupAnagrams(new String[]{});
        assert result.isEmpty();
    }

    @Test
    public void anagramsGroups() {
        List<List<String>> result = GroupAnagrams.groupAnagrams(
                new String[]{"abc", "bca", "cab"});
        assert result.size() == 1;
        assert result.getFirst().size() == 3;
    }

    @Test
    public void noAnagram() {
        List<List<String>> result = GroupAnagrams.groupAnagrams(
                new String[]{"abc", "aef", "cfa"});
        assert result.size() == 3;
    }
}
