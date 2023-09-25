package H_МногопоточноеПрограммирование.CreatingAStream_СозданиеПотока.Example_2;

public class NewThread extends Thread{
    NewThread() {
        // создать новый поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дoчepний поток: " + this);
        start(); // запустить поток на исполнение
    }
    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дoчepний поток прерван.");
        }

        System.out.println("Дoчepний поток завершен.");
    }
}
