package code.leetcode;

public class Subsequence {
    public static void main(String[] args) {
        String s="",t="";

        s = "abc"; t = "ahbgdc";
        System.out.println(s+" is subsequence of "+t+" :true "+isSubsequence(s,t));

        s = "b"; t = "c";
        System.out.println(s+" is subsequence of "+t+" :false "+isSubsequence(s,t));

        s = "axc";
        t = "ahbgdc";
        System.out.println(s+" is subsequence of "+t+" :false"+isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        if(s==null||t==null){
            return false;
        }
        if(s.isEmpty()||(t.isEmpty() && s.isEmpty())){
            return true;
        }
        char[] charArrayS=s.toCharArray();
        char[] charArrayT=t.toCharArray();
        int indexS=0;
        for (int indexT=0;indexT<charArrayT.length;indexT++){
            if(charArrayS[indexS]==charArrayT[indexT]){
                indexS++;
                if(indexS>charArrayS.length-1){
                    return true;
                }
            }
        }
        return false;
    }
}
