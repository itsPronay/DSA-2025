package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int newCount = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], newCount);
            if (newCount >= k){
                set.add(nums[i]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
