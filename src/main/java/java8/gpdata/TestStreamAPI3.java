package java8.gpdata;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java8.gpdata.Employee.Status.*;

public class TestStreamAPI3 {

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 18, 9999.99, FREE),
            new Employee("李四", 38, 55555.55, BUSY),
            new Employee("王五", 50, 6666.66, VOCATION),
            new Employee("赵六", 16, 3333.33, FREE),
            new Employee("田七", 8, 8888.88, BUSY)
    );

    @Test
    public void test1() {
        boolean b1 = employees.stream()
                .allMatch(e -> e.getStatus().equals(BUSY));
        System.out.println(b1);

        System.out.println("---------------------");

        boolean b2 = employees.stream()
                .anyMatch(e -> e.getStatus().equals(BUSY));
        System.out.println(b2);
        System.out.println("---------------------");

        boolean b3 = employees.stream()
                .noneMatch(e -> e.getStatus().equals(BUSY));
        System.out.println(b3);
        System.out.println("---------------------");

        Optional<Employee> op = employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .findFirst();
        System.out.println(op.get());
        System.out.println("---------------------");

        Optional<Employee> op2 = employees.parallelStream()
                .filter(e -> e.getStatus().equals(FREE))
                .findAny();
        System.out.println(op2.get());
        System.out.println("---------------------");

        Long count = employees.stream()
                .count();
        System.out.println(count);
        System.out.println("---------------------");

        Optional<Employee> op3 = employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(op3.get());
        System.out.println("---------------------");

        Optional<Double> op4 = employees.stream()
                .map(Employee::getSalary)
                .min(Double::compare);
        System.out.println(op4.get());

    }
}
