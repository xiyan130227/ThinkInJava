package jvm.classloader;

public class Demo01 {
    public static void main(String[] args) {
//        String str = "aaa";
//        int a = 323432;

        A a = new A();
        System.out.println(A.width);

    }
}

class A {
    public static int width = 100;

    static {
        System.out.println("静态初始化类A");
        width = 300;
    }

    public A() {
        System.out.println("创建A类的对象");
    }
}
