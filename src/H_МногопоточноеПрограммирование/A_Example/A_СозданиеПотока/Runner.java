package H_МногопоточноеПрограммирование.A_Example.A_СозданиеПотока;
import static java.lang.Thread.currentThread;
import javax.sound.midi.Soundbank;

public class Runner {
    public static void main(String[] args) {
        // Главный поток
        System.out.println(currentThread().getName());

        // Создаем новый поток
        final Thread thread = new myThread();
        thread.start();

        // Создаем новый поток с помощью анонимного класса
        final Thread thread_2 = new Thread(){

            @Override
            public void run() {
                System.out.println(currentThread().getName());
            }
        };
        thread_2.start();

        // Создаем новый поток с помощью экземпляра класса который реализует
        // интерфейса Runnable
        final Runnable task = () -> System.out.println(currentThread().getName());
        final Thread thread_3 = new Thread(task);
        thread_3.start();
    }

    private static final class myThread extends Thread{

        @Override
        public void run() {
            System.out.println(currentThread().getName());
        }
    }
}
