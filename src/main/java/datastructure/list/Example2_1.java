package datastructure.list;

public class Example2_1 {
    public static void main(String[] args) throws Exception {
        SqList L = new SqList(10);
        L.insert(0, 'a');
        L.insert(1, 'z');
        L.insert(2, 'd');
        L.insert(3, 'm');
        L.insert(4, 'z');

        int order = L.indexOf('z');
        if (order != -1)
            System.out.println("顺序表中第一次出现值为z的数据的位置为：" + order);
        else
            System.out.println("此顺序表中不包含z值");

    }
}
