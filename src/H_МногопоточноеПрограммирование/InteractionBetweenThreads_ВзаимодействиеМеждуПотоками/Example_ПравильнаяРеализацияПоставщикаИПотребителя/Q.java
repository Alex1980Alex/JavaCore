package H_МногопоточноеПрограммирование.InteractionBetweenThreads_ВзаимодействиеМеждуПотоками.Example_ПравильнаяРеализацияПоставщикаИПотребителя;
// Неправильная реализация поставщика и потребителя
public class Q {
    int n;
    boolean valueSet;


    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа InterruptedException перехвачено");
            }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа InterruptedException перехвачено");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}
