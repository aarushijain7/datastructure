package code.leetcode;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums= {1,2,3,1};
        System.out.println(containsDuplicate(nums));

        int[] nums1= {1,2,3};
        System.out.println(containsDuplicate(nums1));
    }
    public static boolean containsDuplicate(int[] nums) {
        if(nums!=null){
            HashSet<Integer> set=new HashSet<>();
            for (int num:nums){
                if(!set.add(num)){
                    return true;
                }
            }
        }

        return false;
    }
}
