package innerclasses;

interface Service {
    void method();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {

    private Implementation1() {
    }

    public void method() {
        System.out.println("Implementation1 method");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation1();
        }
    };
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
    }
}
