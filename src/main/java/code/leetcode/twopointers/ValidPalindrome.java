package code.leetcode.twopointers;

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

* */
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        s ="pap";
        System.out.println(isPalindrome(s));
        s = "race a car";
        System.out.println(isPalindrome(s));
    }

     public static boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        String lString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        if(s.isEmpty() || s.length()==1){
            return true;
        }
        char[] charArr = lString.toCharArray();
        int stringLength = lString.length();
        for(int startIndex=0,lastIndex=stringLength-1;startIndex<=lastIndex;startIndex++,lastIndex--){
            if(charArr[startIndex]!=charArr[lastIndex]){
                return false;
            }
        }
        return true;
    }
}