package wang.l1n.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/29 17:48
 * @description： https://leetcode-cn.com/problems/valid-parentheses/
 */
public class _20_有效的括号 {

    private static HashMap<Character, Character> map = new HashMap<>();

    static {
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)){
                stack.push(c);
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (c != map.get(left)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
