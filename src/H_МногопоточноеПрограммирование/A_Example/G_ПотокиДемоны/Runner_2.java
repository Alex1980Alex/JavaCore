package H_МногопоточноеПрограммирование.A_Example.G_ПотокиДемоны;

public class Runner_2 {
    private static final String MESSAGE_NAME_AND_DEMON_STATUS = "\n%s : %b";
    public static void main(String[] args) throws InterruptedException {
        Thread firstThreadDemon = new Thread(() -> {
                printThreadNameAndDemonStatus(Thread.currentThread());
                Thread secondThreadDemon = new Thread(()
                        -> printThreadNameAndDemonStatus(Thread.currentThread()));
                secondThreadDemon.start();
            try {
                secondThreadDemon.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        });
        firstThreadDemon.setDaemon(true);
        firstThreadDemon.start();

        firstThreadDemon.join();
    }
    private static void printThreadNameAndDemonStatus(Thread thread){
        System.out.printf(MESSAGE_NAME_AND_DEMON_STATUS, thread.getName(), thread.isDaemon());
    }
}
