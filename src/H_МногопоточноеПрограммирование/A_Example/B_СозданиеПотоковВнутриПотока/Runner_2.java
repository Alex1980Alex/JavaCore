package H_МногопоточноеПрограммирование.A_Example.B_СозданиеПотоковВнутриПотока;

import static java.lang.Thread.currentThread;

// часть Java Stream API, предоставляемого в Java для работы
// с последовательностями данных (streams) в функциональном стиле
import static java.util.stream.IntStream.*;

public class Runner_2 {
    private static final int CREATED_THREADS_AMOUNT = 10;

    public static void main(String[] args) {
        Runnable taskDisplayingThreadName =
                () -> System.out.println(currentThread().getName());

        Runnable taskCreatingThreads = () ->

                // range - это статический метод, предоставляемый Java Stream API,
                // который позволяет создать поток последовательных чисел в определенном диапазоне
                range(0, CREATED_THREADS_AMOUNT)
                        .forEach(i -> startThread(taskDisplayingThreadName));

        startThread(taskCreatingThreads);

    }

    private static void startThread(Runnable runnable){
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
