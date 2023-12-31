package H_МногопоточноеПрограммирование.A_Example.J_ПримерСостоянияГонок;

import java.util.stream.IntStream;

public class Runner {
    private static int counter = 0;
    private static final int INCREMENT_AMOUNT_FIRST_THREAD = 500;
    private static final int INCREMENT_AMOUNT_SECOND_THREAD = 600;
    public static void main(String[] args) throws InterruptedException {
        Thread firstThread = createIncrementingCounterThread(INCREMENT_AMOUNT_FIRST_THREAD);
        firstThread.start();
        Thread secondThread = createIncrementingCounterThread(INCREMENT_AMOUNT_SECOND_THREAD);
        secondThread.start();

        firstThread.join();
        secondThread.join();

        System.out.println(counter);

    }

    private static Thread createIncrementingCounterThread(int incrementAmount){
        return  new Thread(() -> IntStream.range(0, incrementAmount).forEach(i -> incrementCounter()));
    }
    private static synchronized void incrementCounter(){
        counter++;
    }
}
