package algorithm.sort.bubble;


import algorithm.sort.Utils;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean flag = true;
        for (int i = 0; i <= (n - 2) && flag; i++) {
            flag = false;
            for (int j = 0; j <= (n - 1 - (i + 1)); j++) {
                if (array[j] > array[j + 1]) {
                    Utils.swap(array, j, j + 1);

                    flag = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 1, 5, 8, 3, 7, 4, 6, 2};
//        int[] array = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
        BubbleSort.bubbleSort(array);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }
}
