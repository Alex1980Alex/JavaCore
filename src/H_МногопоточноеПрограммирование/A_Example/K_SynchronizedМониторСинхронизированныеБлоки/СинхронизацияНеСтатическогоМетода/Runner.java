package H_МногопоточноеПрограммирование.A_Example.K_SynchronizedМониторСинхронизированныеБлоки.СинхронизацияНеСтатическогоМетода;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Runner {
    private static final int INCREMENT_AMOUNT_FIRST_COUNTER = 500;
    private static final int INCREMENT_AMOUNT_SECOND_COUNTER = 600;
    public static void main(String[] args) throws InterruptedException {

        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter();

            Thread firstThread = createIncrementingCounterThread(INCREMENT_AMOUNT_FIRST_COUNTER,
            i -> firstCounter.increment());
            Thread secondThread = createIncrementingCounterThread(INCREMENT_AMOUNT_FIRST_COUNTER,
                    i -> firstCounter.increment());
            Thread threadThread = createIncrementingCounterThread(INCREMENT_AMOUNT_SECOND_COUNTER,
                    i -> secondCounter.increment());
            Thread fourthTread = createIncrementingCounterThread(INCREMENT_AMOUNT_SECOND_COUNTER,
                    i -> secondCounter.increment());

            startThread(firstThread, secondThread, threadThread, fourthTread);
            joinThread(firstThread, secondThread, threadThread, fourthTread);

            System.out.println(firstCounter.counter);
            System.out.println(secondCounter.counter);

        }

        private static class Counter{
        private int counter;
/*
        private synchronized  void increment(){
            this.counter++;
        }

 */
            private void increment(){
                synchronized (this) {
                    this.counter++;
                }
            }
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

}
