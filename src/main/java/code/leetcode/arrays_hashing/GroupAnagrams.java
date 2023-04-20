package code.leetcode.arrays_hashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("list:");
        Arrays.stream(strs).toList().forEach(str ->System.out.print(str+" "));
        System.out.println("\n\nAnagrams:");
        List<List<String>> list = groupAnagrams(strs);
        list.forEach(strList ->{
            System.out.println("");
            strList.forEach(str ->System.out.print(str+" "));
        });
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null){
            return null;
        }
        List<List<String>> result = new ArrayList<>();
        if(strs.length==1){
            result.add(Arrays.stream(strs).toList());
            return result;
        }
        Set<String> usedSet = new HashSet<>();
        Map<String,Map<Character, Integer> > mapOfWords = new HashMap<>();
        for (String str:strs
             ) {
            mapOfWords.put(str,getCountOfCharactersInString(str));
        }
        for (Map.Entry<String,Map<Character, Integer> > entry: mapOfWords.entrySet()
             ) {
            if(result.isEmpty()){
                List<String> list= new ArrayList<>();
                list.add(entry.getKey());
                result.add(list);
                usedSet.add(entry.getKey());
            }
            else{
                if(usedSet.add(entry.getKey())){
                    boolean isNewListTobeCreated = true;
                    for (List<String> innerList: result
                    ) {
                        if(isAnagram(innerList.get(0),entry.getKey())){
                            innerList.add(entry.getKey());
                            isNewListTobeCreated = false;
                        }
                    }
                    if(isNewListTobeCreated){
                        List<String> list= new ArrayList<>();
                        list.add(entry.getKey());
                        result.add(list);
                    }
                }
            }
        }
        return result;

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
