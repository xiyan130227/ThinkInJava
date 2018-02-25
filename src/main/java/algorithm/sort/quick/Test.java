package algorithm.sort.quick;

public class Test {
    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = arr[low];

        while (i < j) {
            //先看右边，依次往左递减
            while (arr[j] >= temp && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (arr[i] <= temp && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, i - 1);
        //递归调用右半数组
        quickSort(arr, i + 1, high);
    }


    public static void main(String[] args) {
//        int[] array = {9, 1, 5, 8, 3, 7, 4, 6, 2};
        int[] array = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
        Test.quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }
}
