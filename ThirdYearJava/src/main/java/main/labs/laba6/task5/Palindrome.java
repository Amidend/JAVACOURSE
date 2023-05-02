package main.labs.laba6.task5;

import java.util.ArrayList;
import java.util.List;

public abstract class Palindrome {
    private static boolean isPalindrome(String s) {
        for (int i = 0; i < (s.length() / 2); ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDigitSting(String str) {
        for (int j = 0; j < str.length(); j++) {
            if (!Character.isDigit(str.charAt(j)))
                return false;
        }
        return true;
    }

    public static List<String> findDigitPalindromes(String str) {
        List<String> result = new ArrayList<String>();
        for (var i :
                str.split(" ")) {
            if (isDigitSting(i)) {
                if (isPalindrome(i)) {
                    result.add(i);
                }
            }
        }
        return result;
    }
}
