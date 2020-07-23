package wang.l1n.leetcode.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/25 13:55
 * @description： 判断字符串是否为合法IP地址
 */
public class JudgeIP {

    /**
     * 判断IP的四位数是否在[0,255]区间之内
     * @param ip
     * @return
     */
    public static boolean judge(String ip){
        if (ip == null || ip.length() == 0){
            return false;
        }
        String[] c = ip.split("\\.");
        for (int i = 0; i < c.length; i++) {
            if (Integer.parseInt(c[i]) < 0 || Integer.parseInt(c[i]) > 255){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("192.168.1.1", "127.0.0.1", "118.152.14.123","265.123.42.74");
        strings.forEach((string) -> {
            boolean res = judge(string);
            System.out.println(res);
        });
    }
}
