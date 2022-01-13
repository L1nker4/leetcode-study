package wang.l1n.leetcode.contest;

class Solution {
    public static int minPartitions(String n) {
        int res = 0;
        char[] arr = n.toCharArray();
        for(int i = 0; i < arr.length; i++){
            int value = (int) arr[i];
            if(value > res){
                res = value;
            }
        }
        return res;
    }
}