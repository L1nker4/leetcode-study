package wang.l1n.leetcode.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/26 12:57
 * @description：
 */
public class _1365_有多少小于当前数字的数字 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = count(nums[i], nums);
        }
        return res;
    }

    public int count(int value, int[] arr) {
        int res = 0;
        for (int j : arr) {
            if (j < value) {
                res++;
            }
        }
        return res;
    }

    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] arr = new int[101];
        //统计出现频率
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] += 1;
        }
        //对频率从后往前累加
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            if (nums[i] > 0){
                res[i] = arr[nums[i] - 1];
            }
        }
        return res;
    }
}
