package solutions.assignments;

import java.util.Scanner;

public class SubstringOccurrence {
    public static int strStr(String haystack, String needle) {
        if (haystack.isEmpty() || needle.isEmpty())
            return 0;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String haystack = scanner.nextLine();
        String needle = scanner.nextLine();

        scanner.close();

        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}
