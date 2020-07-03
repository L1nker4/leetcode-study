package wang.l1n.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/3 11:20
 * @description： https://leetcode-cn.com/problems/house-robber/
 */
public class _198_打家劫舍 {

    public int rob(int[] nums) {
        int a = 0;
        int b = 1;
        int aSum = 0, bSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0){
                aSum += nums[i];
            }else {
                bSum += nums[i];
            }
        }
        return Math.max(aSum, bSum);
    }
}
