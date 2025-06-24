package solutions.hashing;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0)
            return new ArrayList<>();

        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> uniqMap = new HashMap<>();

        for(String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            List<String> anagrams = uniqMap.getOrDefault(sortedStr, new ArrayList<>());
            anagrams.add(str);
            uniqMap.put(sortedStr, anagrams);
        }

        for(Map.Entry<String, List<String>> entry: uniqMap.entrySet()) {
            result.add(entry.getValue());
        }

        return result;
    }
}
