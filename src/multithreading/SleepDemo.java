package multithreading;

public class SleepDemo {

    public static void main(String[] args) {

        Runnable helloRunnable = () -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello from : " + Thread.currentThread().getName());
            }
        };
        Thread printerThread = new Thread(helloRunnable, "printer-thread");
        Thread displayThread = new Thread(helloRunnable, "display-thread");

        printerThread.start();
        displayThread.start();
    }
}
