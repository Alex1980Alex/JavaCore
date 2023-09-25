package H_МногопоточноеПрограммирование.ApplicationOfSynchronizedMethods_ПрименениеСинхронизированныхМетодов.ОператорSynchronized.Example_2;

public class Synch2 {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1   = new Caller(target, "obj1");
        Caller obj2   = new Caller(target, "obj2");
        Caller obj3   = new Caller(target, "obj3");

        // ожидать завершения потока исполнени
        try {
            obj1.thr.join();
            obj2.thr.join();
            obj3.thr.join();
        } catch (InterruptedException e) {
            System.out.println("прервано");
        }
    }
}

