package code.leetcode;

public class FirstBadeVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));

    }
    public static int firstBadVersion(int n) {
        int startVersion = 0, endVersion = n;

        while (startVersion<=endVersion){
            int midVersion = (startVersion+endVersion) >>> 1;
            if(!isBadVersion(midVersion) && isBadVersion(midVersion+1)){
                return midVersion+1;
            }else if(isBadVersion(midVersion) && !isBadVersion(midVersion-1)){
                return midVersion;
            }else if(isBadVersion(endVersion) && isBadVersion(midVersion)){
                endVersion=midVersion-1;
            }else if(isBadVersion(endVersion) && !isBadVersion(midVersion)){
                startVersion=midVersion+1;
            }
        }
        return 0;
    }
    public static boolean isBadVersion(int version){
        if (version>=1702766719){
            return true;
        }
        return false;
    }

    }
