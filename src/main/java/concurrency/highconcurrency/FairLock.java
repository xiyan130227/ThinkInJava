package concurrency.highconcurrency;

import java.util.concurrent.locks.ReentrantLock;

public class FairLock implements Runnable {
    //    public static ReentrantLock fairLock = new ReentrantLock(true);
    public static ReentrantLock fairLock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                fairLock.lock();
                System.out.println(Thread.currentThread().getName() + " get lock.");
            } finally {
                fairLock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        FairLock lock = new FairLock();
        Thread t1 = new Thread(lock, "Thread_t1");
        Thread t2 = new Thread(lock, "Thread_t2");
        t1.start();
        t2.start();

    }
}
