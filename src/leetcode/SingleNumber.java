package leetcode;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums= {3,4,8,4,3,3};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if ((i == 0 || nums[i] != nums[i - 1]) && (i == nums.length - 1 || nums[i] != nums[i + 1])){
                return nums[i];
            }
        }
        return -1;
    }
}
