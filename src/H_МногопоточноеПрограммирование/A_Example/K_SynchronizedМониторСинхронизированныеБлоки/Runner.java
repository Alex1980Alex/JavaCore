package H_МногопоточноеПрограммирование.A_Example.K_SynchronizedМониторСинхронизированныеБлоки;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Runner {
    private static int first_counter = 0;
    private static int second_counter = 0;
    private static final int INCREMENT_AMOUNT_FIRST_COUNTER = 500;
    private static final int INCREMENT_AMOUNT_SECOND_COUNTER = 600;

    private static final Object LOCK_TO_INCREMENT_FIRST_COUNTER = new Object();
    private static final Object LOCK_TO_INCREMENT_SECOND_COUNTER = new Object();
    public static void main(String[] args) throws InterruptedException {

            Thread firstThread = createIncrementingCounterThread(INCREMENT_AMOUNT_FIRST_COUNTER,
            i -> incrementFirstCounter());
            Thread secondThread = createIncrementingCounterThread(INCREMENT_AMOUNT_FIRST_COUNTER,
                    i -> incrementFirstCounter());
            Thread threadThread = createIncrementingCounterThread(INCREMENT_AMOUNT_SECOND_COUNTER,
                    i -> incrementSecondCounter());
            Thread fourthTread = createIncrementingCounterThread(INCREMENT_AMOUNT_SECOND_COUNTER,
                    i -> incrementSecondCounter());

            startThread(firstThread, secondThread, threadThread, fourthTread);
            joinThread(firstThread, secondThread, threadThread, fourthTread);

            System.out.println(first_counter);
            System.out.println(second_counter);

        }

        // IntConsumer - это часть Java API и представляет собой функциональный интерфейс,
        //который определяет метод для принятия одного целочисленного аргумента и выполнения какой-либо
        //операции над ним.
    private static Thread createIncrementingCounterThread(int incrementAmount,
                                                          IntConsumer incrementingOperation){
        return  new Thread(() -> IntStream.range(0, incrementAmount).forEach(incrementingOperation));
    }
    private static void startThread(Thread... threads){
        Arrays.stream(threads).forEach(Thread::start);
    }
    private static void joinThread(Thread... threads){
        Arrays.stream(threads).forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }
    private static  void incrementFirstCounter(){
        synchronized (LOCK_TO_INCREMENT_FIRST_COUNTER) {
            first_counter++;
        }
    }
    private static  void incrementSecondCounter(){
        synchronized (LOCK_TO_INCREMENT_SECOND_COUNTER) {
            second_counter++;
        }
    }
}
