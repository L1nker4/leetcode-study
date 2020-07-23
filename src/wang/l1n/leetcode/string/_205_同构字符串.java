package wang.l1n.leetcode.string;

import java.util.HashMap;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/12 14:18
 * @description： https://leetcode-cn.com/problems/isomorphic-strings/
 */
public class _205_同构字符串 {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
