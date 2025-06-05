package week1.strings;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbghi";
        boolean result = isSubsequence(s, t);
        System.out.println(result);
    }
    public static boolean isSubsequence(String s, String t) {
        int s_ptr = 0, t_ptr = 0;
        int s_len = s.length(), t_len = t.length();

        while (s_ptr < s_len && t_ptr < t_len) {
            if(s.charAt(s_ptr) == t.charAt(t_ptr)) {
                s_ptr += 1;
                t_ptr += 1;
            } else {
                t_ptr += 1;
            }
        }
        if(s_ptr == s_len)
            return true;
        else
            return false;
    }
}
