//https://neetcode.io/roadmap


import solutions.SearchInRotatedSortedArray;

public class Main {
    public static void main(String[] args) {
//        int arr[] = {3 ,1  };
//        BinarySearch b = new BinarySearch();
//        System.out.println(b.search(arr, 0));

        SearchInRotatedSortedArray s = new SearchInRotatedSortedArray();
        int arr[] = {3 , 2};
        System.out.println(s.search(arr, 2));
    }
}