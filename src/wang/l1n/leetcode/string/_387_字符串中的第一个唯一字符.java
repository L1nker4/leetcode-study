package wang.l1n.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/4/19 11:53
 * @description： https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class _387_字符串中的第一个唯一字符 {


    /**
     * HashMap存储键值对
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int length = arr.length;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int j = 0; j < length; j++) {
            if (map.containsKey(arr[j])){
                if (map.get(arr[j]) == 1){
                    return j;
                }
            }
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        int[] letter=new int[26];
        for (char c:s.toCharArray()) {
            letter[c-'a']++;
        }
        for (int i = 0; i <s.length() ; i++) {
            if(letter[s.charAt(i)-'a']==1) {
                return i;
            }
        }
        return -1;
    }

}
