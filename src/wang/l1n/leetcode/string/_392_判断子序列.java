package wang.l1n.leetcode.string;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/27 20:33
 * @description： https://leetcode-cn.com/problems/is-subsequence/
 */
public class _392_判断子序列 {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0){
            return true;
        }
        int indexS = 0, indexT = 0;
        while (indexT < t.length()){
            if (t.charAt(indexT) == s.charAt(indexS)){
                indexS++;
                if (indexS == s.length()){
                    return true;
                }
            }
            indexT++;
        }
        return false;
    }

    public static void main(String[] args) {
        _392_判断子序列 demo = new _392_判断子序列();
        boolean subsequence = demo.isSubsequence("ahbgdc", "abc");
        System.out.println(subsequence);
    }
}
