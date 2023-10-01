package H_МногопоточноеПрограммирование.A_Example.D_СостояниеПотока;

import static java.lang.String.format;

public class Runner {
    private static final String MESSAGE_TEMPLATE_THREADS_STATE = "%s : %s\n";
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        showThreadState(mainThread);
        Thread thread = new Thread(() -> {
            /*
            try {
                mainThread.join(2000);
                showThreadState(mainThread);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
             */
        });
        showThreadState(thread);
        thread.start();
        showThreadState(thread);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        showThreadState(thread);
        showThreadState(mainThread);
    }
    private static void showThreadState(Thread thread){
        System.out.printf(format(MESSAGE_TEMPLATE_THREADS_STATE, thread.getName(), thread.getState()));
    }
}
