package interfaces;

interface Service {
    void method();
}

interface ServiceFactory {
    Service getService();
}

class Implementaion1 implements Service {

    public void method() {
        System.out.println("Implementation1 method");
    }
}

class Implementaion1Factory implements ServiceFactory {

    public Service getService() {
        return new Implementaion1();
    }
}

class Implementaion2 implements Service {

    public void method() {
        System.out.println("Implementation2 method");
    }
}

class Implementaion2Factory implements ServiceFactory {

    public Service getService() {
        return new Implementaion2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementaion1Factory());
        serviceConsumer(new Implementaion2Factory());
    }
}
