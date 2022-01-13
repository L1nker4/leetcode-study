package wang.l1n.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1207_独一无二的出现次数 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                //hashmap中已经存在该值
                Integer value = map.get(arr[i]) + 1;
                map.put(arr[i], value);
            } else {
                //map中没有该值
                map.put(arr[i], 1);
            }
        }
        Set<Integer> set = new HashSet<>();
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            set.add(entry.getValue());
        }
        return set.size() == map.size();
    }
}
