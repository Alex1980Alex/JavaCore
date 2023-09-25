package H_МногопоточноеПрограммирование.ApplicationOfSynchronizedMethods_ПрименениеСинхронизированныхМетодов.ОператорSynchronized.Example_2;
// В этой программе используется синхронизированный блок
public class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("прервано");
        }
        System.out.println("]");
    }
}
