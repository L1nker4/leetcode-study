package wang.l1n.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：L1nker4
 * @date ： 创建于  2020/6/1 11:34
 * @description： https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class _1431_拥有最多糖果的孩子 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxElement = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxElement){
                maxElement = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxElement){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}
