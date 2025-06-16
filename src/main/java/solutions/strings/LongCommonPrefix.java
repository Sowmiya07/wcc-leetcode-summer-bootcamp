package solutions.strings;

public class LongCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";
        int min = Integer.MAX_VALUE;
        String shortString = "";
        for(String str: strs) {
            if(str.length() < min) {
                shortString = str;
                min = str.length();
            }
        }
        StringBuilder prefix = new StringBuilder(shortString);
        while(!prefix.isEmpty()) {
            int i;
            for(i = 0; i < strs.length; i++) {
                if(!strs[i].startsWith(prefix.toString()))
                    break;
            }
            if(i == strs.length)
                break;
            else
                prefix.deleteCharAt(prefix.length() -1);
        }
        return prefix.toString();
    }
}
