package algorithm.sort.insert;

import algorithm.sort.Utils;

public class InsertSort {
    public static void insertSort(int[] array) {
        int i, j;
        int n = array.length;
        int target;

        for (i = 1; i < n; i++) {
            target = array[i];

            for (j = i; j > 0 && target < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }

            array[j] = target;
        }
    }

    public static void main(String[] args) {
//        int[] array = {0, 9, 1, 5, 8, 3, 7, 4, 6, 2};
//        int[] array = {0, 5, 3, 4, 6, 2};
        int[] array = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
        InsertSort.insertSort(array);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }
}
