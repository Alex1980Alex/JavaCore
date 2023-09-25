package H_МногопоточноеПрограммирование.ApplicationOfSynchronizedMethods_ПрименениеСинхронизированныхМетодов.СинхронизированныйМетоды.Example;

public class Caller implements Runnable{
    String msg;
    Callme target;
    Thread thr;

    // В этом конструкторе создается также новый поток исполнения,
    // в котором вызывается метод run() для данного объекта.
    public Caller(Callme trg, String s) {
        target = trg;
        msg    = s;
        thr    = new Thread(this);
        thr.start();
    }
    public void run() {
        target.call(msg);
    }
}
