package algorithm.sort.quick;

import algorithm.sort.Utils;

public class QuickSort {

    public static void quickSort(int[] array) {
        int n = array.length;
        qSort(array, 0, n - 1);
    }

    public static void qSort(int[] array, int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(array, low, high);
            qSort(array, low, pivot - 1);
            qSort(array, pivot + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivotkey;
        pivotkey = array[low];
        while (low < high) {
            while (low < high && array[high] >= pivotkey) {
                high--;
            }

            if (low < high) {
                Utils.swap(array, low, high);
                low++;
            }

            while (low < high && array[low] <= pivotkey) {
                low++;
            }

            if (low < high) {
                Utils.swap(array, low, high);
                high--;
            }
        }

        return low;
    }

    public static void main(String[] args) {
//        int[] array = {0, 9, 1, 5, 8, 3, 7, 4, 6, 2};
        int[] array = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
        QuickSort.quickSort(array);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }
}
