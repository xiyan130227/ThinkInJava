package algorithm.sort.merge;

public class MergeSort {

    public static void mergeSort(int[] array) {
        int n = array.length;
        mSort(array, 0, n - 1);
    }

    public static void mSort(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {

            //拆分
            mSort(array, low, mid);
            mSort(array, mid + 1, high);
            //合并
            merge(array, low, mid, high);
        }
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[high - low + 1];

        while (i <= mid && j <= high) {
            if (array[i] <= array[j])
                temp[k++] = array[i++];
            else
                temp[k++] = array[j++];
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= high) {
            temp[k++] = array[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int x = 0; x < temp.length; x++) {
            array[x + low] = temp[x];
        }
    }

    public static void main(String[] args) {
//        int[] array = {9, 1, 5, 8, 3, 7, 4, 6, 2};
//        int[] array = {16, 7, 13, 10, 9, 15, 3, 2, 5, 8, 12, 1, 11, 4, 6, 14};
        int[] array = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
        MergeSort.mergeSort(array);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }
}
