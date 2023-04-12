package code.leetcode.dp;

import java.util.Arrays;

public class ClimbingStairsMinCost {
    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(climbStairs(cost));
    }

    public static int climbStairs(int[] cost) {
        int[] steps = {1,2};
        int[] memory = new int[cost.length+1];
        Arrays.fill(memory,-1);
        return climbStairsRecursive(0,cost.length,steps,memory);
    }

    public static int climbStairsRecursive(int currStep, int target, int[] steps, int[] memory){
        if(currStep==target){
            return 1;
        }
        if(currStep>target){
            return 0;
        }
        if(memory[currStep]!=-1){
            return memory[currStep];
        }
        int ans=0;
        for (int step:steps ) {
            ans+=climbStairsRecursive(currStep+step,target,steps, memory);
        }
        return memory[currStep]=ans;
    }
}
