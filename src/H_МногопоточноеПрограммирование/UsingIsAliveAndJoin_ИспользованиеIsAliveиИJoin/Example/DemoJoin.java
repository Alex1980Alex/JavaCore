package H_МногопоточноеПрограммирование.UsingIsAliveAndJoin_ИспользованиеIsAliveиИJoin.Example;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        NewThread ob3 = new NewThread("Три");
        System.out.println("Пoтoк Один запущен: " + ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен:  " + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен:  " + ob3.t.isAlive());

        // ожидать завершения потоков исполнения
        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Пoтoк Один запущен: " + ob1.t.isAlive());
        System.out.println("Пoтoк Два запущен:  " + ob2.t.isAlive());
        System.out.println("Пoтoк Три запущен:  " + ob3.t.isAlive());
        System.out.println("Глaвный поток завершен.");
    }
}
/* Потоки прекращают исполнение после того, как управление возвращается из вызовов метода join().
Выводимый результат, может оказаться иным в зависимости от конкретной исполняющей среды.
-----------------------------
Новый поток: Thread[Один,5,main]
Новый поток: Thread[Два,5,main]
Новый поток: Thread[Три,5,main]
Пoтoк Один запущен: true
Пoтoк Два запущен:  true
Пoтoк Три запущен:  true
Oжидaниe завершения потоков.
Один:	5
Два:	5
Три:	5
Два:	4
Один:	4
Три:	4
Два:	3
Один:	3
Три:	3
Один:	2
Три:	2
Два:	2
Один:	1
Два:	1
Три:	1
Три:	завершен.
Один:	завершен.
Два:	завершен.
Пoтoк Один запущен: false
Пoтoк Два запущен:  false
Пoтoк Три запущен:  false
Глaвный поток завершен.
 */
