package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutexEvenGenerator extends IntGenerator {
    private int currentEventValue = 0;
    private Lock lock = new ReentrantLock();

    @Override
    public int next() {
        try {
            lock.lock();
            ++currentEventValue;
            Thread.yield();
            ++currentEventValue;
            return currentEventValue;
        } finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        EvenChecker.test(new MutexEvenGenerator());

    }

}
