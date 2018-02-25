package algorithm.sort.shell;

import algorithm.sort.Utils;

public class ShellSort {
    //    public static void shellSort(int[] arrays) {
    public static void shellSort(int[] array) {
        int i, j;
        int n = array.length;
        int increment = n;

        do {
            increment = increment / 2;
            for (i = increment; i < n; i++) {
                j = i - increment;
                while (j >= 0 && array[j] > array[i]) {
                    Utils.swap(array, i, j);
                    j -= increment;
                }
            }
        } while (increment >= 1);
    }

    public static void main(String[] args) {
//        int[] array = {0, 9, 1, 5, 8, 3, 7, 4, 6, 2};
        int[] array = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
        ShellSort.shellSort(array);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }
}
