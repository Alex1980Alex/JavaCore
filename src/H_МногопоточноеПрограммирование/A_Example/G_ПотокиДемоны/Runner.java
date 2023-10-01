package H_МногопоточноеПрограммирование.A_Example.G_ПотокиДемоны;

import java.util.concurrent.TimeUnit;

public class Runner {
    private static final String MESSAGE_MAIN_THREAD_FINISHED = "main thread is finished";
    private static final String MESSAGE_NAME_AND_DEMON_STATUS = "\n%s : %b";
    public static void main(String[] args) {
        printThreadNameAndDemonStatus(Thread.currentThread());

        Thread thread = new Thread(new Task());
        printThreadNameAndDemonStatus(thread);
        thread.setDaemon(true);
        printThreadNameAndDemonStatus(thread);
        thread.start();

        System.out.println(MESSAGE_MAIN_THREAD_FINISHED);
    }
    private static void printThreadNameAndDemonStatus(Thread thread){
        System.out.printf(MESSAGE_NAME_AND_DEMON_STATUS, thread.getName(), thread.isDaemon());
    }
    private static class Task implements Runnable{
        private static final String MESSAGE = "I am working";
        private static final int DURATION_BETWEEN_MESSAGE_IN_SECOND = 2;
        @Override
        public void run() {
            while (true){
                System.out.println(MESSAGE);
                try {
                    TimeUnit.SECONDS.sleep(DURATION_BETWEEN_MESSAGE_IN_SECOND);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
