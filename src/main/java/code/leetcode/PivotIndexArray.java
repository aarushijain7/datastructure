package code.leetcode;

import java.util.Arrays;

public class PivotIndexArray {
    public static void main(String[] args) {

        int[] nums={2,1,-1};
        System.out.println("Pivot Index:"+pivotIndex(nums));

    }
    public static int pivotIndex(int[] nums) {
        if(nums==null || nums.length==0){
            return -1;
        }
        if(nums.length==1){
            return 0;
        }
        int[] runningSum = runningSum(nums);
        int totalSum=runningSum[runningSum.length-1];
        if(totalSum-nums[0]==0){
            return 0;
        }
        for (int index=1;index<nums.length;index++){
            int leftSum = runningSum[index]-nums[index];
            int righSum = totalSum-leftSum-nums[index];
            if(leftSum==righSum){
                return index;
            }
        }
        return -1;
    }
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int lastSum=0;
        for (int index=0;index<nums.length;index++){
            runningSum[index]=lastSum+nums[index];
            lastSum=runningSum[index];
        }
        return runningSum;
    }

}
