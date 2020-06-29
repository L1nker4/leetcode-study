package wang.l1n;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/6/29 13:18
 * @description： https://leetcode-cn.com/problems/generate-parentheses/
 */
public class _22_括号生成 {

    public List<String> generateParenthesis(int n) {
        List<String> data = new ArrayList<>();
        genernate(0,0,n,"",data);
        return data;
    }

    private void genernate(int left, int right, int n, String s, List<String> data) {
        if(left == n && right == n){
            data.add(s);
            return;
        }
        if (left < n){
            genernate(left + 1, right, n, s + "(",data);
        }
        if (left > right){
            genernate(left, right + 1, n, s + ")",data);
        }

    }
}
