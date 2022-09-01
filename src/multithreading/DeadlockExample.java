package multithreading;

class ChildThread extends Thread {

    Thread mainThread;

    public ChildThread(Thread mainThread) {
        this.mainThread = mainThread;
    }

    @Override
    public void run() {

        try {
            mainThread.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class DeadlockExample {

    public static void main(String[] args) throws InterruptedException {

        Thread mainThread = Thread.currentThread();
        ChildThread childThread = new ChildThread(mainThread);

        childThread.start();

        try {
            childThread.join();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread");
        }
    }
}
