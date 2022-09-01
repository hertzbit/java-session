package multithreading;

class DownloaderThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 1000 == 0) {
                System.out.println(Thread.currentThread().getName() + " : Downloading Data");
            }
        }
    }
}

class DownloaderRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 1000 == 0) {
                System.out.println(Thread.currentThread().getName() + " : Downloading Data");
            }
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {

        DownloaderThread downloaderThread = new DownloaderThread();
        downloaderThread.setName("downloader-thread");
        downloaderThread.start();

        DownloaderRunnable downloaderRunnable = new DownloaderRunnable();
        Thread downloaderRunnableThread = new Thread(downloaderRunnable);
        downloaderRunnableThread.setName("downloader-runnable");
        downloaderRunnableThread.start();

        Thread lambdaThread = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                if (i % 1000 == 0) {
                    System.out.println(Thread.currentThread().getName() + " : Downloading Data");
                }
            }
        }, "lambda-thread");
        lambdaThread.start();

        Thread anonymousThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    if (i % 1000 == 0) {
                        System.out.println(Thread.currentThread().getName() + " : Downloading Data");
                    }
                }
            }
        }, "anonymous-thread");
        anonymousThread.start();

        System.out.println(Thread.currentThread().getName() + " : Another Independent Operation Starts");
        System.out.println(Thread.currentThread().getName() + " : Another Independent Operation Ends");
    }

}
