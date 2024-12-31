package solutions;

// https://neetcode.io/problems/find-target-in-rotated-sorted-array

public class BinarySearch {

    public int search(int[] nums, int target) {

        int length = nums.length;

        int pivot  = -1;

        // try to find the pivot
        // ex: 2, 4, 5, 6, 1, 2
        // considering pivot == 6
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                System.out.println(pivot);
                pivot = i;
                break;
            }
        }
        int start = 0, end = pivot, mid;

        int trySearch = binarySearch(nums, 0, pivot, target);

        if (trySearch != -1){
            return trySearch;
        }

        trySearch = binarySearch(nums, pivot + 1, length - 1, target);

        return trySearch;
    }

    public int binarySearch(int[] arr, int start, int end, int target){

        int mid;
        // 1, 2, 5, 6, 7, 9
        while (start < end){
            mid = start + ( end - start) /2;

            if ( arr[mid] > target ){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
            else return mid;

        }
        return -1;
    }
}
