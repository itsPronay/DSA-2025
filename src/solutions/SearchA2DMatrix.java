package solutions;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0, end = matrix[i].length - 1, mid;

            while (start <= end) {
                mid = start + (end - start) / 2;

                if(matrix[i][mid] > target){
                    end = mid - 1;
                } else if(matrix[i][mid] < target){
                    start = mid + 1;
                }
                else return true;
            }
        }
        return false;
    }

}
