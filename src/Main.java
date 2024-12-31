//https://neetcode.io/roadmap


import solutions.SearchA2DMatrix;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SearchA2DMatrix s = new SearchA2DMatrix();
        int[][] matrix = {
                {1, 2, 4, 8},
                {10, 11, 12, 13},
                {14, 20, 30, 40}
        };
        s.searchMatrix(matrix, 10);
    }
}