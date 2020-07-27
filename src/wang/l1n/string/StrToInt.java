package wang.l1n.string;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/7/25 16:18
 * @description： 输入一个由数字组成的字符串，把它转换成整数并输出。例如：输入字符串"123"，输出整数123。
 */
public class StrToInt {

    public int strToInt(String str) {
        //str为null，返回0
        if(str == null){
            return 0;
        }
        //记录当前可能的数字是正数还是负数
        boolean positive = true;

        //记录-、+是否出现，并且只能出现一次
        boolean flag = true;

        //str.trim()，去掉前后空格，其实这里应该自己写一个方法，有点偷懒了
        char[] chs = str.trim().toCharArray();

        //记录可能的数值
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<chs.length; i++){
            //正负号只能出现一次，并且前面没有数字，否则无效
            if(sb.length() == 0 && flag && (chs[i] == '-' || chs[i] == '+')){
                positive = chs[i] == '+';
                flag = false;
                //如果字符在'0'～'9'就记录当前字符
            }else if(chs[i] >= '0' && chs[i] <= '9'){
                sb.append(chs[i]);
            }else {
                //出现非正负号、数字字符，退出循环
                break;
            }
        }
        //如果没有有效的数字，返回0
        if(sb.length() == 0){
            return 0;
        }
        String curStr = sb.toString();
        char[] curChs = curStr.toCharArray();

        //num类型为long，因为有可能溢出
        long num = 0;
        for (char ch : curChs) {
            //num * 10 和 num * 10 + ch - '0'需要独立判断，
            // 因为有可能num*10就溢出了，也有可能num *10 + ch - '0'才溢出（这里的溢出指超过Integer的范围）
            if (num * 10 > Integer.MAX_VALUE || num * 10 + ch - '0' > Integer.MAX_VALUE) {
                //溢出的话，根据正负号返回相应的极值
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                num = num * 10 + ch - '0';
            }
        }
        //有效数字没有溢出，返回对应的结果
        return positive ? (int) num : (int) -num;
    }

}
