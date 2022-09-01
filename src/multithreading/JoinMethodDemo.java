package multithreading;

class CardDesignerThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts designing card");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " card designing completed");
    }
}

class CardPrinterThread extends Thread {

    private CardDesignerThread cardDesignerThread;

    public CardPrinterThread(CardDesignerThread cardDesignerThread) {
        this.cardDesignerThread = cardDesignerThread;
    }

    @Override
    public void run() {
        try {
            cardDesignerThread.join();
            System.out.println(Thread.currentThread().getName() + " starts printing card");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " card printing completed");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

class CardDistributorThread extends Thread {

    private CardPrinterThread cardPrinterThread;

    public CardDistributorThread(CardPrinterThread cardPrinterThread) {
        this.cardPrinterThread = cardPrinterThread;
    }

    @Override
    public void run() {

        try {
            cardPrinterThread.join();
            System.out.println(Thread.currentThread().getName() + " starts distributing card");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " card distribution completed");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

public class JoinMethodDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main Thread Starts");

        CardDesignerThread cardDesignerThread = new CardDesignerThread();
        cardDesignerThread.setName("card-designer-thread");

        CardPrinterThread cardPrinterThread = new CardPrinterThread(cardDesignerThread);
        cardPrinterThread.setName("card-printer-thread");

        CardDistributorThread cardDistributorThread = new CardDistributorThread(cardPrinterThread);
        cardDistributorThread.setName("card-distributor-thread");

        cardDesignerThread.start();
        cardPrinterThread.start();
        cardDistributorThread.start();

        cardDistributorThread.join();

        System.out.println("Main Thread Ends");
    }
}
