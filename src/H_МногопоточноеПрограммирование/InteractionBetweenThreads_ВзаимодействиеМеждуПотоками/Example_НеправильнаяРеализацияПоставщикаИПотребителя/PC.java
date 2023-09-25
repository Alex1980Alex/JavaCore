package H_МногопоточноеПрограммирование.InteractionBetweenThreads_ВзаимодействиеМеждуПотоками.Example_НеправильнаяРеализацияПоставщикаИПотребителя;

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Для остановки нажмите Ctrl+C");
    }
}
/*
Несмотря на то что методы put() и get() синхронизированы в классе Q,
ничто не остановит переполнение потребителя
данными от поставщика, как и ничто не помешает потребителю дважды извлечь один
и тот же элемент из очереди.
В итоге будет выведен неверный результат.

--------------------------------------
Отправлено: 1
Получено: 1
Получено: 1
Получено: 1
Получено: 1
Получено: 1
Отправлено: 2
Отправлено: 3
Отправлено: 4
Отправлено: 5
Отправлено: 6
Отправлено: 7
Получено: 7

 */
