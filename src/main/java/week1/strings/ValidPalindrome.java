package week1.strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a 0, c0anal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        if(s == null || s.isBlank())
            return true;

        s = s.strip();
        int leftPtr = 0, rightPtr = s.length() - 1;

        while(leftPtr < rightPtr) {
            char left = s.charAt(leftPtr);
            char right = s.charAt(rightPtr);

            if(Character.isLetterOrDigit(left) && Character.isLetterOrDigit(right)) {
                if(Character.toLowerCase(left) == Character.toLowerCase(right)) {
                    leftPtr += 1;
                    rightPtr -= 1;
                } else {
                    break;
                }
            } else if(!Character.isLetterOrDigit(left)) {
                leftPtr += 1;
            } else {
                rightPtr -= 1;
            }
        }

        return rightPtr <= leftPtr;
    }
}
