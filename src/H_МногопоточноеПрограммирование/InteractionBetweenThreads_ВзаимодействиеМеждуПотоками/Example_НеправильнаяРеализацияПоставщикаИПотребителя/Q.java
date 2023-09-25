package H_МногопоточноеПрограммирование.InteractionBetweenThreads_ВзаимодействиеМеждуПотоками.Example_НеправильнаяРеализацияПоставщикаИПотребителя;
// Неправильная реализация поставщика и потребителя
public class Q {
    int n;

    synchronized int get() {
        System.out.println("Получено: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("Отправлено: " + n);
    }
}
