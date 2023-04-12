package code.leetcode;

public class LongestPalindromeWithoutChangingSequence {
    public static void main(String[] args) {

        System.out.println("rorate longest palindrome is:"+longestPalindrome("rorate"));
        System.out.println("tuttttttttt longest palindrome is:"+longestPalindrome("tuttttttttt"));
    }
    public static String longestPalindrome(String str){
        String tempLongestPalindrome = new String();
        for (int indexFirst = 0; indexFirst< str.length()-1; indexFirst++){
            for (int indexSecond = indexFirst; indexSecond< str.length()-1;indexSecond++){
                String tempString = str.substring(indexFirst,indexSecond);
                if(isPalindrome(tempString) && tempString.length()>tempLongestPalindrome.length()){
                    tempLongestPalindrome = tempString;
                }
            }
        }
        return tempLongestPalindrome;
    }
    public static boolean isPalindrome(String str){
        String tempStr = str.toLowerCase();
        for(int beginningIndex=0, lastIndex=str.length()-1;beginningIndex<str.length() && lastIndex>=beginningIndex;
            beginningIndex++,lastIndex--){
            if(str.charAt(beginningIndex)!=str.charAt(lastIndex)){
                return false;
            }
        }
        return true;
    }
}
