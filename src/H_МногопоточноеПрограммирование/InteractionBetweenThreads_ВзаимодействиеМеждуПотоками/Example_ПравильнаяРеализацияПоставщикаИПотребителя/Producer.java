package H_МногопоточноеПрограммирование.InteractionBetweenThreads_ВзаимодействиеМеждуПотоками.Example_ПравильнаяРеализацияПоставщикаИПотребителя;

public class Producer implements Runnable{
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            q.put(i++);
        }
    }
}
