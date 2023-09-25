package H_МногопоточноеПрограммирование.Deadlock_Взаимоблокировка.Example;

public class Deadlock implements Runnable{
    A a = new A();
    B b = new B();
    Deadlock() {
        Thread.currentThread().setName("Главный поток");
        Thread thr = new Thread(this, "Соперничающий поток");
        thr.start();

        // получить блокировку для объекта "а" в данном потоке исполнения
        a.foo(b);
        System.out.println("Haзaд в главный поток");
    }

    public void run() {
        //получить блокировку для объекта "b" в другом потоке исполнения
        b.bar(a);
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
/* -----------------------------------------------
Главный поток вошел в метод A.foo()
Соперничающий поток вошел в метод B.bar()
Соперничающий потокпытается вызвать метод A.last()
Главный потокпытается вызвать метод B.last()
...
 */
