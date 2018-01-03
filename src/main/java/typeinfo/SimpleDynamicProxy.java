package typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy.getClass: " + proxy.getClass() + ", method: " + method + ", args: " + args);
//        System.out.println("&&&& proxy: " + proxy);   //此处会有无限循环

        if (method.getName().equals("doSomething"))
            System.out.println("Proxy detected the doSomething method");

        if (args != null)
            for (Object arg : args)
                System.out.println("    " + arg);

        long start = System.nanoTime();
        Object ret = method.invoke(proxied, args);
        long duration = System.nanoTime() - start;
        System.out.println("METHOD-CALL TIME: " + duration);

        return ret;
    }
}

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
//        consumer(real);

        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{
                        Interface.class
                },
                new DynamicProxyHandler(real)
        );

        consumer(proxy);
    }
}
