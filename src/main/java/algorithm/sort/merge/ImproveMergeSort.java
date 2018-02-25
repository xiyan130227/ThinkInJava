package algorithm.sort.merge;


public class ImproveMergeSort {

    /**
     * 迭代替换递归。
     */
    public static void improveMergeSort(int[] array) {

    }

    public static void main(String[] args) {
        int[] array = {50, 10, 90, 30, 70, 40, 80, 60, 20};
        ImproveMergeSort.improveMergeSort(array);

        for (int i : array) {
            System.out.print(i + "    ");
        }
    }

}
