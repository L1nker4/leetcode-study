package wang.l1n.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/28 17:33
 * @description： https://leetcode-cn.com/problems/partition-labels/
 */
public class _763_划分字母区间 {

    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        int length = S.length();
        for (int i = 0; i < length; i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        List<Integer> partition = new ArrayList<Integer>();
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (i == end) {
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }
}
