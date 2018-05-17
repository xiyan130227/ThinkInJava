package algorithm.sort.shell;

import algorithm.sort.Utils;

public class ShellSort {
    //    public static void shellSort(int[] arrays) {
//    public static void shellSort(int[] array) {
//        int i, j;
//        int n = array.length;
//        int increment = n;
//
//        do {
//            increment = increment / 2;
//            for (i = increment; i < n; i++) {
//                for (j = i - increment; j >= 0; j -= increment) {
//                    if (array[j] > array[i]) {
//                        Utils.swap(array, i, j);
//                    }
//                }
//            }
//
//            for(int m : array) {
//                System.out.print(m);
//            }
//            System.out.println();
//        } while (increment >= 1);
//    }

    public static void shellSort(int[] array) {
        int j = 0;
        int temp = 0;
        int n = array.length;
        for (int increment = n / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < n; i++) {
                temp = array[i];
                for (j = i - increment; j >= 0; j -= increment) {
                    if (temp < array[j]) {
                        array[j + increment] = array[j];
                    } else {
                        break;
                    }
                }
                array[j + increment] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {0, 9, 1, 5, 8, 3, 7, 4, 6, 2};
//        int[] array = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
        ShellSort.shellSort(array);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }
}
