package phase1.assignments;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s)
    {
        if(s == null || s.isEmpty())
            return "";
        StringBuilder sb = new StringBuilder(s);
        int length = sb.length();
        for(int leftIdx = 0; leftIdx < length/2; leftIdx++) {
            int rightIdx = length - leftIdx - 1;
            char temp = sb.charAt(leftIdx);
            sb.setCharAt(leftIdx, sb.charAt(rightIdx));
            sb.setCharAt(rightIdx, temp);
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            String reversed = reverseString(input);
            System.out.println(reversed);
        } catch (NoSuchElementException e) {

        }
    }
}
