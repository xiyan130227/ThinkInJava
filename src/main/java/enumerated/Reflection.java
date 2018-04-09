package enumerated;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore{
    HERE, THERE,
}

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {


        for(Type t: enumClass.getGenericInterfaces())
            System.out.println(t);
        System.out.println("Base: " + enumClass.getSuperclass());

        Set<String> methods = new TreeSet<>();

        for(Method m: enumClass.getMethods())
            methods.add(m.getName());
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        System.out.println(exploreMethods);

        Set<String> enumMethods = analyze(Enum.class);
        System.out.println(exploreMethods.containsAll(enumMethods));


        System.out.println("===========");
        System.out.println(exploreMethods.removeAll(enumMethods));
        System.out.println(exploreMethods);

    }
}
