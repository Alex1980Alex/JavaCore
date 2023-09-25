package H_МногопоточноеПрограммирование.ApplicationOfSynchronizedMethods_ПрименениеСинхронизированныхМетодов.ОператорSynchronized.Example;

public class Caller implements Runnable{
    String msg;
    Callme target;
    Thread thr;

    public Caller(Callme trg, String s) {
        target = trg;
        msg    = s;
        thr    = new Thread(this);
        thr.start();
    }

    // здесь выполняются синхронизированные вызовы метода call()
    public void run() {
        synchronized (target)  { // синхронизированный блок
            target.call(msg);
        }
    }
}
