package wang.l1n.leetcode.string;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/10/21 15:56
 * @description：
 */
public class _925_长按键入 {

    /**
     * 双指针
     * @param name
     * @param typed
     * @return
     */
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }

}

class Test{
    private int m;
    public static void fun(){

    }
}
