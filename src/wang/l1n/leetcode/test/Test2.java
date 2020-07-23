package wang.l1n.leetcode.test;

import java.util.*;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/5/25 14:11
 * @description： 用自己熟悉的语言编写一个函数：输入是一个n*n的二维数组。该数组可以看做是一个五子棋的棋盘。
 * 其中某个元素为1代表该位置摆放的是黑子，-1表示白子，0表示没有任何棋子。
 * 函数的返回值是判断该五子棋盘的状态，一共三种可能：黑棋赢、白棋赢、不分胜负。
 * 其中某一种颜色的棋子在横线、竖线、或斜线方向超过5个子即为胜利。
 */
public class Test2 {

    /**
     * 返回1表示黑棋赢，返回-1表示白棋赢，返回0表示不分胜负
     *
     * @param arr
     * @return
     */
    public static int test(int[][] arr) {
        int res = 0;
        for (int row = 0; row < arr.length; row++) {
            res = rowCheck(arr[row]);
            if (res != 0) {
                return res;
            }
        }
        for (int col = 0; col < arr.length; col++) {
            res = colCheck(arr, col);
            if (res != 0) {
                return res;
            }
        }
        res = obliqueCheck(arr);
        if (res != 0) {
            return res;
        }
        return 0;
    }

    private static int obliqueCheck(int[][] arr) {
        int len = 0;

        //获取对角遍历结果
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            len += arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                if (map.containsKey(i + j)) {
                    map.get(i + j).add(arr[i][j]);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i][i]);
                    map.put(i + j, list);
                }
            }
        }
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            int[] row = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                row[i] = list.get(i);
            }
            if (list.size() > 5) {
                return rowCheck(row);
            }
        }
        return 0;
    }

    private static int colCheck(int[][] arr, int col) {
        int flag = arr[0][col];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][col] == arr[i - 1][col]) {
                count++;
                if (arr[i][col] == 1) {
                    flag = 1;
                } else if (arr[i][col] == -1) {
                    flag = -1;
                }
            } else {
                count = 0;
            }
        }
        if (count == 5) {
            return flag;
        } else {
            return 0;
        }
    }

    private static int rowCheck(int[] rows) {
        int flag = rows[0];
        int count = 0;
        for (int i = 1; i < rows.length; i++) {
            if (rows[i] == rows[i - 1]) {
                count++;
                if (rows[i] == 1) {
                    flag = 1;
                } else if (rows[i] == -1) {
                    flag = -1;
                }
            } else {
                count = 0;
            }
        }
        if (count == 5) {
            return flag;
        } else {
            return 0;
        }
    }
}
