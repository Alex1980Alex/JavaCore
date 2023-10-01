package H_МногопоточноеПрограммирование.A_Example.E_ПрерываниеПотоков;

import java.util.concurrent.TimeUnit;

public class Runner_5 {
    private static final String MESSAGE_REQUEST_WAS_SENT = "\nRequest was sent.";
    private static final int DURATION_IN_SECOND_DELIVERING_RESPONSE = 1;
    private static final int DURATION_IN_FIVE_SECOND_DELIVERING_RESPONSE = 5;
    private static final String MESSAGE_RESPONSE_WAS_RECEIVED = "Response was received";
    private static final String MESSAGE_SERVER_WAS_STOPPED = "Server was stopped";
    private static final String MESSAGE_THREAD_WAS_INTERRUPTED = "Thread was interrupted";
    public static void main(String[] args) {
        Thread communicatingThread = new Thread(() -> {
                try {
                    // Проверка завершения потока
                    while (!Thread.currentThread().isInterrupted()) {
                        doRequest();
                    }
                } catch (InterruptedException e) {
                    System.out.println(MESSAGE_THREAD_WAS_INTERRUPTED);
                }

        });
        communicatingThread.start();

        try {
            TimeUnit.SECONDS.sleep(DURATION_IN_FIVE_SECOND_DELIVERING_RESPONSE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread stoppingThread = new Thread(() -> {
            if (isServerShouldBeOffed()){
                // Завершение потока
                communicatingThread.interrupt();
                stopServer();
            }
        });

        stoppingThread.start();
    }
    private static void doRequest() throws InterruptedException {
        System.out.println(MESSAGE_REQUEST_WAS_SENT);
        // перечисление (enum) которое предоставляет удобный
        //способ для работы с единицами времени.
        TimeUnit.SECONDS.sleep(DURATION_IN_SECOND_DELIVERING_RESPONSE);
        System.out.println(MESSAGE_RESPONSE_WAS_RECEIVED);
    }

    private static boolean isServerShouldBeOffed(){
        return true;
    }
    private static void stopServer(){
        System.out.println(MESSAGE_SERVER_WAS_STOPPED);
    }
}
