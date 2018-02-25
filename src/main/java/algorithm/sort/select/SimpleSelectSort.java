package algorithm.sort.select;

import algorithm.sort.Utils;
import algorithm.sort.bubble.BubbleSort;

public class SimpleSelectSort {

    public static void simpleSelectSort(int[] array) {
        int i, j, min;
        int n = array.length;
        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j <= n - 1; j++) {
                if (array[min] > array[j])
                    min = j;
            }
            if (i != min)
                Utils.swap(array, i, min);
        }
    }

    public static void main(String[] args) {
//        int[] array = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        int[] array = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
        SimpleSelectSort.simpleSelectSort(array);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }
}
