package java8.gpdata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamAPI2 {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99),
            new Employee("李四", 38, 55555.55),
            new Employee("王五", 50, 6666.66),
            new Employee("赵六", 16, 3333.33),
            new Employee("田七", 8, 7777.77),
            new Employee("田七", 8, 7777.77),
            new Employee("田七", 8, 7777.77)
    );

    @Test
    public void test1() {
        Stream<Employee> stream = employees.stream()
//                .filter((e) -> e.getAge() > 35)
                .filter((e) -> {
                    System.out.println("*************");
                    return e.getAge() > 35;
                });

        stream.forEach(System.out::println);
    }

    @Test
    public void test2() {
        Iterator<Employee> it = employees.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    @Test
    public void test3() {
        employees.stream()
//                .filter((e) -> e.getSalary() > 5000)
                .filter((e) -> {
                    System.out.println("短路 &&");
                    return e.getSalary() > 5000;
                })
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    public void test4() {
        employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .skip(2)
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test5() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");

        list.stream()
                .map(str -> str.toUpperCase())
                .forEach(System.out::println);

        System.out.println("-------------------");

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("-------------------");

        Stream<Stream<Character>> stream = list.stream()
                .map(TestStreamAPI2::filterCharacter);

        stream.forEach(sm -> {
            sm.forEach(System.out::println);
        });

        System.out.println("-------------------");

        Stream<Character> sm = list.stream()
                .flatMap(TestStreamAPI2::filterCharacter);

        sm.forEach(System.out::println);
    }

    public static Stream<Character> filterCharacter(String str) {
        List<Character> list = new ArrayList<>();

        for(Character ch: str.toCharArray()) {
            list.add(ch);
        }

        return list.stream();
    }

    @Test
    public void test6() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");

        List list2 = new ArrayList();

        list2.add(11);
        list2.add(22);
//        list2.add(list);
        list2.addAll(list);

        System.out.println(list2);
    }

    @Test
    public void test7() {
        List<String> list = Arrays.asList("ccc", "aaa", "bbb", "ddd", "eee");

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("------------------------");

        employees.stream()
                .sorted((e1, e2) -> {
                    if(e1.getAge().equals(e2.getAge())) {
                        return e1.getName().compareTo(e2.getName());
                    } else {
//                        return e1.getAge().compareTo(e2.getAge());
                        return -e1.getAge().compareTo(e2.getAge());
                    }
                }).forEach(System.out::println);
    }
}
