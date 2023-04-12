package code.leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num= {-1,0,3,5,9,12};
        System.out.println(search(num, 3));
    }
    public static int search(int[] nums, int target) {
        int startIndex=0, endIndex = nums.length-1;
        while(startIndex<=endIndex){
            int mid = (startIndex+endIndex)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<=target){
                startIndex=mid+1;
            }else{
                endIndex=mid-1;
            }
        }
        return -1;
    }
}
