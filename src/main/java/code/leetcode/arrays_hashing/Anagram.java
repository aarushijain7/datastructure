package code.leetcode.arrays_hashing;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println("s="+s+" t="+t+":"+isAnagram(s,t));
        s = "rat"; t = "car";
        System.out.println("s="+s+" t="+t+":"+isAnagram(s,t));
    }
    public static boolean isAnagram(String string1, String string2) {
        if((string1==null || string2== null ) || (string1.length()!=string2.length())){
            return false;
        }
        if(string1.isBlank() && string2.isBlank()){
            return true;
        }
        Map<Character, Integer> countOfStr1= getCountOfCharactersInString(string1);
        Map<Character, Integer> countOfStr2= getCountOfCharactersInString(string2);
        if(countOfStr1.size()!=countOfStr2.size()){
            return false;
        }
        for (Map.Entry<Character, Integer> keyset:countOfStr1.entrySet()){
            if(!(countOfStr2.containsKey(keyset.getKey())) || !(countOfStr2.get(keyset.getKey()).equals(countOfStr1.get(keyset.getKey())))){
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> getCountOfCharactersInString(String string1) {
        Map<Character, Integer> countOfString = new IdentityHashMap<>();
        char[] charArray = string1.toCharArray();
        for (char ch:charArray){
            if(countOfString.containsKey(ch)){
                countOfString.put(ch,countOfString.get(ch)+1);
            }else{
                countOfString.put(ch,1);
            }
        }
        return countOfString;
    }
}
