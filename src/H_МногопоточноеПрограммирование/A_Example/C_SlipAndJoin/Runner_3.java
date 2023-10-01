package H_МногопоточноеПрограммирование.A_Example.C_SlipAndJoin;

import java.util.stream.IntStream;

public class Runner_3 {
    private static final int FROM_NUMBER_FIRST_THREAD = 1;
    private static final int TO_NUMBER_FIRST_THREAD = 500;
    private static final int FROM_NUMBER_SECOND_THREAD = 501;
    private static final int TO_NUMBER_SECOND_THREAD = 1000;
    private static final String TEMPLATE_MESSAGE_THREAD_NAME_NUMBER = "%s : %d\n";
    private static final int TIME_WAITING_IN_MILLIS = 1000;

    public static void main(String[] args) {
        TaskSummingNumbers firstTask = startSubTask(FROM_NUMBER_FIRST_THREAD, TO_NUMBER_FIRST_THREAD );
        TaskSummingNumbers secondTask = startSubTask(FROM_NUMBER_SECOND_THREAD, TO_NUMBER_SECOND_THREAD );

        waitFromTaskFinished();

        int resultNumber = firstTask.getResultNumber() + secondTask.getResultNumber();
        printThreadNameAndNumber(resultNumber);
    }

    private static void waitFromTaskFinished(){
        try {
            Thread.sleep(TIME_WAITING_IN_MILLIS); // ждем выполнения первого и второго потока (firstTask, secondTask)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printThreadNameAndNumber(int number){
        System.out.printf(TEMPLATE_MESSAGE_THREAD_NAME_NUMBER, Thread.currentThread().getName(), number);
    }

    private static TaskSummingNumbers startSubTask(int fromNumber, int toNumber){
        TaskSummingNumbers subTask = new TaskSummingNumbers(fromNumber, toNumber );
        Thread thread = new Thread(subTask);
        thread.start();
        return subTask;
    }
    private static final class  TaskSummingNumbers implements Runnable{
        private static final int INITIAL_VALUE_RESULT_NUMBER = 0;
        private int fromNumber;
        private int toNumber;
        private int resultNumber;

        public TaskSummingNumbers(int fromNumber, int toNumber) {
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

