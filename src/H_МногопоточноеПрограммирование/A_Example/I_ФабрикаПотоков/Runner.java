package H_МногопоточноеПрограммирование.A_Example.I_ФабрикаПотоков;

import java.util.concurrent.ThreadFactory;

public class Runner {
    private static final String MESSAGE_EXCEPTION_TEMPLATE = "Exception was throw message '%s' " +
            "in thread '%s'.\n";
    public static void main(String[] args) throws InterruptedException {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (thread, exception)
                -> System.out.printf(MESSAGE_EXCEPTION_TEMPLATE, exception.getMessage(), thread.getName());

        ThreadFactory threadFactory =
                new DaemonThreadWithUncaughtExceptionHandlerFactory(uncaughtExceptionHandler);

        Thread firstthread = threadFactory.newThread(new Task());
        firstthread.start();

        Thread secondthread = threadFactory.newThread(new Task());
        secondthread.start();

        Thread threethread = threadFactory.newThread(new Task());
        threethread.start();

        firstthread.join();
        secondthread.join();
        threethread.join();

    }
    private static class Task implements Runnable{
        private static final String EXCEPTION_MESSAGE = "I am exception";

        @Override
        public void run() {
            System.out.println(Thread.currentThread().isDaemon());
            throw new RuntimeException(EXCEPTION_MESSAGE);
        }
    }

    private static class DaemonThreadWithUncaughtExceptionHandlerFactory implements ThreadFactory {
        private final Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

        DaemonThreadWithUncaughtExceptionHandlerFactory(Thread.UncaughtExceptionHandler uncaughtExceptionHandler){
            this.uncaughtExceptionHandler = uncaughtExceptionHandler;
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            thread.setDaemon(true);
            return thread;
        }
    }
}
