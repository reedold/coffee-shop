//package leetcode;
//
//public class BinarySearch {
//    public static void main(String[] args) {
//        int[] nums = {2,5};
//        int target = 5;
//        System.out.println(search(nums, target));
//    }
//
//    public static int search(int[] nums, int target) {
////        for (int i = 0; i < nums.length; i++) {
////            if (nums[i]==target) {
////                return i;
////            }
////        }
////        return -1;
////        int prev;
////        int len = nums.length - 1;
////        int mid = len / 2;
////        len /= 2;
////        while (target <= nums[nums.length - 1] && target >= nums[0]) {
////            if (nums[mid] ==target ) {
////                return mid;
////            }
////            prev=nums[mid];
////            if(len==1){
////                if (nums[prev]>nums[mid]) {
////                    return -1;
////                }
////                else {
////                    return mid;
////                }
////            }
////            else if (nums[mid] > target) {
////                len-=len/2;
////                mid-=len;
////            }
////            else {
////                len-=len/2;
////                mid+=len;
////            }
////        }
////        return -1;
////        int len = nums.length - 1;
////        int mid = len / 2;
////        len /= 2;
////
////        while (target <= nums[nums.length - 1] && target >= nums[0]) {
////            if (nums[mid] == target) {
////                return mid;
////            }
////
////            int prev = mid;
////
////            if (len == 1) {
////                if (nums[prev] == target) {
////                    return prev;
////                } else {
////                    return -1;
////                }
////            } else if (nums[mid] > target) {
////                mid -= len;
////            } else {
////                mid += len;
////            }
////            len /= 2;
////            if (mid < 0 || mid >= nums.length) {
////                break;
////            }
////        }
////        return -1;
////    }
//
//}