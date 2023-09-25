package H_МногопоточноеПрограммирование.ApplicationOfSynchronizedMethods_ПрименениеСинхронизированныхМетодов.ОператорSynchronized.Example;

public class Synch1 {
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
/*
В данном примере метод call() объявлен без модификатора доступа synchronized.
Вместо этого используется оператор synchronized в теле метода run() из класса Caller.
Благодаря этому получается тот же правильный результат, что и в предыдущем примере (Synch.java),
поскольку каждый поток исполнения ожидает завершения предыдущего потока.
Результат выполнения данной программы:
--------------------------------------
[obj1]
[obj3]
[obj2]
 */
