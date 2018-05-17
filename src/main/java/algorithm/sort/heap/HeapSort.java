package algorithm.sort.heap;

import algorithm.sort.Utils;

public class HeapSort {
    public static void heapSort(int[] array) {

        if (array == null || array.length <= 1) {
            return;
        }

        buildMaxHeap(array);

        for (int i = array.length - 1; i >= 1; i--) {
            Utils.swap(array, 0, i);

            heapAdjust(array, i, 0);
        }
    }

    private static void buildMaxHeap(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int half = array.length / 2;
        for (int i = half; i >= 0; i--) {
            heapAdjust(array, array.length, i);
        }
    }

    private static void heapAdjust(int[] array, int heapSize, int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;

        int largest = index;
        if (left < heapSize && array[left] > array[index]) {
            largest = left;
        }

        if (right < heapSize && array[right] > array[largest]) {
            largest = right;
        }

        if (index != largest) {
            Utils.swap(array, index, largest);

            heapAdjust(array, heapSize, largest);
        }
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
