import java.util.Scanner;

public class ThreadExampleVolatile extends Thread {
    //volatile keyword is used to enhance that thread should read the latest value of the variable
    //and the value is not cached by the thread
    public volatile boolean valid = true;

    public void run() {
        while (valid) {
            System.out.println("Thread is running.....");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stopExcecution()
    {
        valid = false;
    }

    public static void main(String[] args) {
        ThreadExampleVolatile t = new ThreadExampleVolatile();
        t.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        t.stopExcecution();
    }

}
