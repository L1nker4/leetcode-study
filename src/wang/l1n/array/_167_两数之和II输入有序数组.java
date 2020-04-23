package wang.l1n.array;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/23 20:55
 * @description： https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class _167_两数之和II输入有序数组 {

    /**
     * O(n^2)
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        for (int i = 0; i < numbers.length - 1 && numbers[i] <= target; i++) {
            for (int j = i + 1; j < numbers.length && numbers[i] <= target; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i +1, j + 1};
                }
            }
        }
        return new int[2];
    }

    public int[] twoSum2(int[] numbers, int target) {
        if (numbers == null) {
            return null;
        }
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }
}
