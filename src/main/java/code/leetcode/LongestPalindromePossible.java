package code.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromePossible {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String str) {
        int longestPalindromePossible = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int index = 0; index < str.length(); index++) {
            if (map.containsKey(str.charAt(index))) {
                int value = map.get(str.charAt(index))+1;
                map.put(str.charAt(index), value);
            } else {
                map.put(str.charAt(index), 1);
            }
        }
        boolean isSingleMiddleElement = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            longestPalindromePossible = ((value / 2) * 2) + longestPalindromePossible;
            if (!isSingleMiddleElement && value % 2 == 1) {
                isSingleMiddleElement = true;
            }
        }
        if (isSingleMiddleElement) {
            longestPalindromePossible++;
        }
        return longestPalindromePossible;

    }

}
