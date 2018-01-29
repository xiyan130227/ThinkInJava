package concurrency.highconcurrency;

public class DeadLock implements Runnable {
    protected Object tool;

    static Object fork1 = new Object();
    static Object fork2 = new Object();

    private String name;

    public DeadLock(Object obj) {
        this.tool = obj;
        if (tool == fork1) {
            this.setName("PersonA");
        }

        if (tool == fork2) {
            this.setName("PersonB");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        if (tool == fork1) {
            synchronized (fork1) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (fork2) {
                    System.out.println("PersonA start to eat!");
                }
            }
        }

        if (tool == fork2) {
            synchronized (fork2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (fork1) {
                    System.out.println("PersonB start to eat!");
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread personA = new Thread(new DeadLock(fork1));
        Thread personB = new Thread(new DeadLock(fork2));
        personA.start();
        personB.start();
        Thread.sleep(1000);
    }
}
