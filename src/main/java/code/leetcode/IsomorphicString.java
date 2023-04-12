package code.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {
    public static void main(String[] args) {
        String s,t;
        s = "foo"; t = "bar";
        System.out.println(s+" and "+t+" are isomorphic:false "+isIsomorphic(s,t));

        s = "paper"; t = "title";
        System.out.println(s+" and "+t+" are isomorphic:true "+isIsomorphic(s,t));

        s = "badc"; t = "baba";
        System.out.println(s+" and "+t+" are isomorphic:false "+isIsomorphic(s,t));

        s = "egg"; t = "add";
        System.out.println(s+" and "+t+" are isomorphic:true "+isIsomorphic(s,t));


    }
    public static boolean isIsomorphic(String s, String t) {
        if(s==null||t==null||(s!=null&&t!=null&&s.length()!=t.length())){
            return false;
        }
        char[] charArray1=s.toCharArray();
        char[] charArray2=t.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        Set<Character> usedValues = new HashSet<>();

        for (int index = 0; index<charArray1.length;index++){
            if(map.containsKey(charArray1[index]) &&
                    charArray2[index]!=map.get(charArray1[index])){
                return false;
            }else {
                if(map.containsKey(charArray1[index]) || usedValues.add(charArray2[index])){
                map.put(charArray1[index],charArray2[index]);
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
