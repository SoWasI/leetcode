import jdk.nashorn.internal.ir.ReturnNode;

import java.lang.annotation.Target;
import java.util.Arrays;

/**
 * Created by 张 on 2017/7/1.
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        //限制了时间复杂度o(lgn),暴力遍历肯定不行了
        //尝试二分查找
        int n = 0, m = nums.length - 1;
        int res = binarySerrch(n, m, nums, target);
        int[] ress = new int[2];
        if (res == -1) {
            int[] temp = {-1, -1};
            ress = temp;
        } else {
            int b = res, e = res;
            while (b >= 1 && nums[b - 1] == nums[b]) {
                b--;
            }
            while (e <= nums.length - 2 && nums[e + 1] == nums[e]) {
                e++;
            }

            int[] temp = {b, e};
            ress = temp;
        }
        return ress;
    }

    public int binarySerrch(int begin, int end, int[] nums, int target) {
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (target > nums[mid])
                begin = mid + 1;
            else if (target < nums[mid])
                end = mid - 1;
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2};
        int target = 2;
        new Solution34().searchRange(nums, target);
    }
}
