package algorithm.sort.heap;

import algorithm.sort.Utils;

public class HeapSort {
    public static void heapSort(int[] array) {
        int n = array.length;
        buildMaxHeap(array);
        for (int i = n - 1; i > 1; i--) {
            Utils.swap(array, 0, i);
            adjustDownToUp(array, 0, i);
        }
    }

    private static void buildMaxHeap(int[] array) {
        int n = array.length;
        for (int i = (n - 2) / 2; i >= 0; i--) {
            adjustDownToUp(array, i, n);
        }
    }

    private static void adjustDownToUp(int[] array, int k, int length) {
        int temp = array[k];

    }


    public static void main(String[] args) {
//        int[] array = {0, 9, 1, 5, 8, 3, 7, 4, 6, 2};
//        int[] array = {0, 50, 10, 90, 30, 70, 40, 80, 60, 20};
//        int[] array = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
        int[] array = {6, 10, 2, 5, 7, 1, 4, 8, 3, 9};
        HeapSort.heapSort(array);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }
}
