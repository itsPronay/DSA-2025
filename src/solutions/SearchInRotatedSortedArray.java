package solutions;

// https://neetcode.io/problems/find-target-in-rotated-sorted-array

public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        int start = 0, end = nums.length - 1, mid;

        while (start <= end) {

            mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // if left side is in order
            // 7, 8, 9, 10, 0, 1, 2, 3, 4,
            // mid = nums[2] = 9
            if (nums[mid] >= nums[start]) {
                if (nums[mid] >= target && nums[start] <= target) {
                    end = mid - 1;
                } else start = mid + 1;
            }
            // if right side is in order
            // 7, 8, 9, 10, 0, 1, 2, 3, 4
            // mid = nums[5] = 0
            else {
                if (nums[mid] <= target && nums[end] >= target){
                    start = mid + 1;
                }
                else end = mid - 1;
            }

        }

        return -1;
    }

}
