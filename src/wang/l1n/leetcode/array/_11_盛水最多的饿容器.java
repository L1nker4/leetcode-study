package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/26 16:04
 * @description： https://leetcode-cn.com/problems/container-with-most-water/
 */
public class _11_盛水最多的饿容器 {


    /**
     * 暴力
     * O(n^2)
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int max = 0;
        for (int i = 0 , j = height.length -1; i < j;) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j --];
            int area = (j - i + 1) * minHeight;
            max = Math.max(max, area);
        }
        return max;
    }

}
