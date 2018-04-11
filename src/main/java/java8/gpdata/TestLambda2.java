package java8.gpdata;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;

public class TestLambda2 {

//    () -> System.out.println("Hello Lambda!");
    @Test
    public void test1() {
        int num = 0;

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!!!" + num);
            }
        };

        r.run();

        System.out.println("-------------------------");

        Runnable r1 = () -> System.out.println("Hello Lambda!!!" + num);
        r1.run();
    }


//    (x) -> System.out.println(x);
//    x -> System.out.println(x);
    @Test
    public void test2() {
        Consumer<String> con = (x) -> System.out.println(x);
//        Consumer<String> con = x -> System.out.println(x);
        con.accept("Hello");
    }

//     (x, y) -> {...;  ...;}
    @Test
    public void test3() {
        Comparator<Integer> com = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
    }

    @Test
    public void test4() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> com1 = (Integer x, Integer y) -> Integer.compare(x, y);
    }

    @Test
    public void test5() {
        String[] str = {"aaa", "bbb", "ccc"};

//        String[] str2 ;
//        str2 = {"aaa", "bbb"};

        List<String> list = new ArrayList<>();

        show(new HashMap<>());
    }

    public void show(Map<String, Integer> map) {}

    @Test
    public void test6() {
        Integer num = operation(100, x -> x * x);
        System.out.println(num);

        System.out.println(operation(200, y -> y + 200));
    }

    public Integer operation(Integer num, MyFun<Integer> mf) {
        return mf.getValue(num);
    }
}
