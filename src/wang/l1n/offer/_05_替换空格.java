package wang.l1n.offer;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/16 0:04
 * @description：
 */
public class _05_替换空格 {

    public String replaceSpace(String s) {
        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' '){
                ans.append("%20");
            }else {
                ans.append(arr[i]);
            }
        }
        return ans.toString();
    }
}
