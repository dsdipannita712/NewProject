public class SynchronizedExample {
    int count = 0;

    public synchronized void increment() {
        count = count + 1;
    }

    public void doJob() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("count :" + count);
    }
    public static void main(String[] args) {
        SynchronizedExample ep = new SynchronizedExample();
        ep.doJob();
    }
}
