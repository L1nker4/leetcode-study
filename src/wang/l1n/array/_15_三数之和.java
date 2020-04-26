package wang.l1n.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/26 16:42
 * @description： https://leetcode-cn.com/problems/3sum/
 */
public class _15_三数之和 {


    /**
     * 暴力遍历时间复杂度为O(n^3)
     * 排序之后双指针逼近
     * 时间复杂度O(n^2)
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length; k++) {
            //当前数字大于零，总和必定大于零
            if (nums[k] > 0) {
                break;
            }
            //去重
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1, j = nums.length -1;
            while (i < j){
                int sum =  nums[k] + nums[i] + nums[j];
                if (sum == 0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    //去重
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }else if (sum < 0){
                    while(i < j && nums[i] == nums[++i]);
                }else if (sum > 0){
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }
}
