package code.leetcode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] output = twoSum1(nums, target);
        Arrays.stream(output).forEach(System.out::println);

    }

    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int[] sum = new int[2];
        Arrays.fill(sum,-1);
        for (int index = 0; index < nums.length; index++) {
            map.put(nums[index], index);
        }
        for (int index = 0; index < nums.length; index++) {
            int secondNum = target-nums[index];
            if (map.containsKey(secondNum) && index!=map.get(secondNum)) {
                sum = new int[2];
                sum[0] = index;
                sum[1] = map.get(secondNum);
                return sum;
            }
        }
        return nums;
    }
}