package H_МногопоточноеПрограммирование.ApplicationOfSynchronizedMethods_ПрименениеСинхронизированныхМетодов.СинхронизированныйМетоды.Example_2;

public class Callme {

    // Этот метод принимает параметр msg типа String
    // и пытается вывести символьную строку в квадратных скобках
    void call(String msg) {
        System.out.print("[" + msg);
        // после того, как метод call() выведет символьную строку,
        // он вызывает метод Thread.sleep(1000) и приостанавливает
        // текущий поток исполнения на 1 секунду
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("прервано");
        }
        System.out.println("]");
    }
}
