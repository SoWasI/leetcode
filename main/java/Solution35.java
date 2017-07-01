/**
 * Created by 张 on 2017/7/1.
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                a = i;
            } else if (target > nums[i]){
                a++;
            } else if (target < nums[i]) {
                break;
            }
        }
        return a;
    }
}
