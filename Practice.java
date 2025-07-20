package TimePass;

class Counter {
    int ct = 0;

    public synchronized void Increment() {
        ct += 1;
    }
}

public class Practice {
    public static void main(String[] args) {
        Counter cn = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                cn.Increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                cn.Increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();  // Wait for t1 to finish
            t2.join();  // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Counter: " + cn.ct); // Should print 200
    }
}
