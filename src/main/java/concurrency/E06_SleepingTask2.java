package concurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SleepTask2 implements Runnable {
    private static Random random = new Random();
    private final int sleep_time = random.nextInt(10) + 1;

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(sleep_time);
        } catch (InterruptedException e) {
            System.err.println("Interrupted: " + e);
        }
        System.out.println(sleep_time);
    }
}

public class E06_SleepingTask2 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        if(args.length != 1) {
            System.err.println("Provide the quantity of tasks to run");
            return;
        }
        for(int i = 0; i < Integer.parseInt(args[0]); i ++)
            exec.execute(new SleepTask2());
        Thread.yield();
        exec.shutdown();
    }
}
