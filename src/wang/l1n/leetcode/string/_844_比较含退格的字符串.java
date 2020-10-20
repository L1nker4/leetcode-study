package wang.l1n.leetcode.string;

import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/19 12:38
 * @description：
 */
public class _844_比较含退格的字符串 {

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        char[] schar = S.toCharArray();
        char[] tchar = T.toCharArray();
        for (int i = 0; i < schar.length; i++) {
            if (schar[i] != '#'){
                stack1.push(schar[i]);
            }else {
                if (!stack1.isEmpty()){
                    stack1.pop();
                }
            }
        }
        for (int i = 0; i < tchar.length; i++) {
            if (tchar[i] != '#'){
                stack2.push(tchar[i]);
            }else {
                if (!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }
        if (stack1.size() != stack2.size()){
            return false;
        }
        int size1 = stack1.size();
        char[] demo1 = new char[size1];
        for (int i = size1 -1; i >= 0; i--) {
            demo1[i] = stack1.pop();
        }
        int size2 = stack2.size();
        char[] demo2 = new char[size2];
        for (int i = size2 -1; i >= 0; i--) {
            demo2[i] = stack2.pop();
        }
        String s = String.valueOf(demo1);
        String t = String.valueOf(demo2);
        return s.equals(t);
    }
}
