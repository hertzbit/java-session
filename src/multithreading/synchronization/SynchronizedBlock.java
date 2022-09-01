package multithreading.synchronization;

class GreetDisplay {

    public void wish(String personName) {
        /*
        10000 LOC -> which take around 30 secs to execute
         */
        synchronized (GreetDisplay.class) {
            for (int i = 0; i < 5; i++) {
                System.out.print("Good Morning : ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(personName);
            }
        }
        /*
        10000 LOC -> which takes around 2 minuted to execute
         */
    }
}

class GreetDisplayThread extends Thread {

    GreetDisplay greetDisplay;
    String personName;

    public GreetDisplayThread(GreetDisplay greetDisplay, String personName) {
        this.greetDisplay = greetDisplay;
        this.personName = personName;
    }

    @Override
    public void run() {
        this.greetDisplay.wish(this.personName);
    }
}
public class SynchronizedBlock {

    public static void main(String[] args) {

        GreetDisplay greetDisplayA = new GreetDisplay();
        GreetDisplay greetDisplayB = new GreetDisplay();

        GreetDisplayThread greetDisplayThreadOne = new GreetDisplayThread(greetDisplayA, "Chetan");
        GreetDisplayThread greetDisplayThreadTwo = new GreetDisplayThread(greetDisplayB, "Aman");

        greetDisplayThreadOne.start();
        greetDisplayThreadTwo.start();
    }
}
