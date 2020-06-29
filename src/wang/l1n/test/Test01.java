package wang.l1n.test;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/9 18:06
 * @description：
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(12 ^ 0);
    }

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }
}
