package H_МногопоточноеПрограммирование.A_Example.H_ОбработчикНеобрабатываемыхИсключений;

public class Runner {
    private static final String MESSAGE_EXCEPTION_TEMPLATE = "Exception was throw message '%s' " +
            "in thread '%s'.\n";
    public static void main(String[] args) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (thread, exception)
                -> System.out.printf(MESSAGE_EXCEPTION_TEMPLATE, exception.getMessage(), thread.getName());
        Thread firstthread = new Thread(new Task());
        firstthread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        firstthread.start();

        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        Thread secondthread = new Thread(new Task());
        secondthread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        secondthread.start();

        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        Thread threethread = new Thread(new Task());
        threethread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        threethread.start();

    }
    private static class Task implements Runnable{
        private static final String EXCEPTION_MESSAGE = "I am exception";

        @Override
        public void run() {
            throw new RuntimeException(EXCEPTION_MESSAGE);
        }
    }
}
