package H_МногопоточноеПрограммирование.InteractionBetweenThreads_ВзаимодействиеМеждуПотоками.Example_НеправильнаяРеализацияПоставщикаИПотребителя;

public class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }

    public void run() {

        while (true) {
            q.get();
        }
    }
}
