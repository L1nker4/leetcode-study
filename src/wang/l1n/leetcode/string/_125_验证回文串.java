package wang.l1n.leetcode.string;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/19 12:45
 * @description： https://leetcode-cn.com/problems/valid-palindrome/
 */
public class _125_验证回文串 {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = s.toLowerCase().toCharArray();
        int start = 0,end = arr.length -1;
        while(start < end){
            if (arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
