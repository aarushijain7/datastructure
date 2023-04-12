package code.leetcode;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] output = runningSum(nums);
        Arrays.stream(output).forEach(System.out::println);
    }
    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        int lastSum=0;
        for (int index=0;index<nums.length;index++){
            output[index]=lastSum+nums[index];
            lastSum=output[index];
        }
        return output;
    }
}
