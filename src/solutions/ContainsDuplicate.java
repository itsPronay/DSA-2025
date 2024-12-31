package solutions;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet set =  new HashSet();

        for (int i = 0; i< nums.length; i++ ){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        return false;

    }
}
