package H_МногопоточноеПрограммирование.A_Example.C_SlipAndJoin;

import java.util.stream.IntStream;

public class Runner_4 {
    private static final int FROM_NUMBER_FIRST_THREAD = 1;
    private static final int TO_NUMBER_FIRST_THREAD = 500;
    private static final int FROM_NUMBER_SECOND_THREAD = 501;
    private static final int TO_NUMBER_SECOND_THREAD = 1000;
    private static final String TEMPLATE_MESSAGE_THREAD_NAME_NUMBER = "%s : %d\n";

    public static void main(String[] args) {
        TaskSummingNumber firstTask = new TaskSummingNumber(FROM_NUMBER_FIRST_THREAD, TO_NUMBER_FIRST_THREAD);
        Thread thread_1 = new Thread(firstTask);
        thread_1.start();

        TaskSummingNumber secondTask  = new TaskSummingNumber(FROM_NUMBER_SECOND_THREAD, TO_NUMBER_SECOND_THREAD);
        Thread thread_2 = new Thread(secondTask );
        thread_2.start();

        waitFromTaskFinished(thread_1, thread_2);

        int resultNumber = firstTask.getResultNumber() + secondTask.getResultNumber();
        printThreadNameAndNumber(resultNumber);
    }

    private static void waitFromTaskFinished(Thread ... threads){
        for (Thread thread:
                threads) {
            try {
                thread.join(); // ожидаем выполнение потоков
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void printThreadNameAndNumber(int number){
        System.out.printf(TEMPLATE_MESSAGE_THREAD_NAME_NUMBER, Thread.currentThread().getName(), number);
    }


    private static final class  TaskSummingNumber implements Runnable{
        private static final int INITIAL_VALUE_RESULT_NUMBER = 0;
        private int fromNumber;
        private int toNumber;
        private int resultNumber;

        public TaskSummingNumber(int fromNumber, int toNumber) {
            this.fromNumber = fromNumber;
            this.toNumber = toNumber;
            this.resultNumber = INITIAL_VALUE_RESULT_NUMBER;
        }

        @Override
        public void run() {
            // используется для создания последовательного потока (stream) целых
            // чисел в заданном диапазоне, включая начальное и конечное значения этого диапазона
            IntStream.rangeClosed(this.fromNumber, this.toNumber)
                    .forEach(i -> this.resultNumber += i);
            printThreadNameAndNumber(this.resultNumber);
        }

        public int getResultNumber() {
            return resultNumber;
        }
    }
}
