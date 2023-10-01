package H_МногопоточноеПрограммирование.A_Example.F_ПриоритетПотоков;

public class Runner_6 {
    private static final String MESSAGE_TEMPLATE_THREAD_NAME = "\n%s : %d";
    public static void main(String[] args) {
        printNameAndPriority(Thread.currentThread());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        printNameAndPriority(Thread.currentThread());

        Thread thread_2 = new Thread(() -> printNameAndPriority(Thread.currentThread()));
        thread_2.start();
        printNameAndPriority(thread_2);
        printNameAndPriority(Thread.currentThread());

    }
    private static void printNameAndPriority(Thread thread){
        System.out.printf(MESSAGE_TEMPLATE_THREAD_NAME, thread.getName(), thread.getPriority());
    }
}
