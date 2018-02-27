package datastructure.list;

import java.util.Scanner;

public class DuLinkList implements IList {

    private DuLNode head;

    public DuLinkList() {
        this.head = new DuLNode();
        head.setPrior(head);
        head.setNext(head);
    }

    public DuLinkList(int n) throws Exception {
        this();
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < n; j++)
            insert(0, sc.next());
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public Object get(int i) throws Exception {
        return null;
    }

    @Override
    public void insert(int i, Object x) throws Exception {
        DuLNode p = head.getNext();
        int j = 0;
        while (!p.equals(head) && j < i) {
            p = p.getNext();
            ++j;
        }
        if (j != i && !p.equals(head))
            throw new Exception("插入位置不合法");
        DuLNode s = new DuLNode(x);
        p.getPrior().setNext(s);
        s.setPrior(p.getPrior());
        s.setNext(p);
        p.setPrior(s);
    }

    @Override
    public void remove(int i) throws Exception {
        DuLNode p = head.getNext();
        int j = 0;
        while (!p.equals(head) && j < i) {
            p = p.getNext();
            ++j;
        }

        if (j != i)
            throw new Exception("删除位置不合理");
        p.getPrior().setNext(p.getNext());
        p.getNext().setPrior(p.getPrior());
    }

    @Override
    public int indexOf(Object x) {
        return 0;
    }

    @Override
    public void display() {
        DuLNode node = head.getNext();
        while (!node.equals(head)) {
            System.out.print(node.getData() + "     ");
            node = node.getNext();
        }
        System.out.println();
    }

    public DuLNode getHead() {
        return head;
    }

    public void setHead(DuLNode head) {
        this.head = head;
    }
}
