package wang.l1n.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/24 20:53
 * @description：
 *
 *
 * 给定两个分别由字母组成的字符串A和字符串B
 * 字符串B的长度比字符串A短。
 * 请问，如何最快地判断字符串B中所有字母是否都在字符串A里？
 *
 */
public class StringContains {

    /**
     * 暴力
     * @param a
     * @param b
     * @return
     */
    public Boolean stringContains(String a, String b){
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        boolean flag = false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    flag = true;
                }else {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public Boolean stringContains2(String a, String b){
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int j = 0; j < array2.length; j++) {
            int i = 0;
            while ((i < array1.length) && (array1[i] < array2[j])){
                ++i;
            }
            if ((i >= array1.length) || (array1[i] > array2[j])){
                return false;
            }
            ++j;
        }
        return true;
    }

    public Boolean stringContains3(String a, String b){
        HashSet<Character> set = new HashSet<>();
        char[] arr1 = a.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        char[] arr2 = b.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            if (!set.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringContains contains = new StringContains();
        Boolean flag = contains.stringContains3("ABCD", "ACD");
        System.out.println(flag);
    }
}
