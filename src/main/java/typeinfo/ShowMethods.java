package typeinfo;
import java.lang.reflect.*;
import java.util.regex.*;

public class ShowMethods {
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        System.out.println("\n\n*******************");
        try {
            Class<?> c = Class.forName("typeinfo.ShowMethods");
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            for(Method method : methods) {
//                System.out.println(method.toString());
//                System.out.println(p.matcher(method.toString()));
                System.out.println(p.matcher(method.toString()).replaceAll(""));
            }
            for(Constructor constructor : ctors) {
                System.out.println(constructor.toString());
                System.out.println(p.matcher(constructor.toString()).replaceAll(""));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
}
