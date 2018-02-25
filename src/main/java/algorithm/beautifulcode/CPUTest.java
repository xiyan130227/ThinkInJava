package algorithm.beautifulcode;

public class CPUTest {
    public static void main(String[] args) {
        int busyTime = 9600000;
        int idleTime = busyTime;
        long startTime = 0;
        while (true) {
            startTime = System.currentTimeMillis();
            // busy loop
            while ((System.currentTimeMillis() - startTime) <= busyTime)
                ;
            // idle loop
            try {
                Thread.sleep(idleTime);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
