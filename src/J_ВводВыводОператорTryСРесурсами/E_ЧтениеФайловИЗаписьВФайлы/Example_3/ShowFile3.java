package J_ВводВыводОператорTryСРесурсами.E_ЧтениеФайловИЗаписьВФайлы.Example_3;

// Переделанная последовательность операторов try/catch
import java.io.*;
public class ShowFile3 {
    public static void main(String[] args) {
        int i;
        // FileInputStream это класс, предназначенный для чтения данных из файла.
        // Он является частью пакета java.io,
        // который предоставляет классы и методы для работы с потоками ввода-вывода.
        // FileInputStream наследует функциональность от класса InputStream и позволяет открывать
        // файл и читать данные из него байтами. Когда файл открывается с помощью
        FileInputStream fis = null;

        /*
        // Проверяем, что указано имя файла
        if (args.length != 1) {
            System.out.println("Не указано: имя_файла");
            return;
        }
         */
        // Пробуем открыть файл
        // абсолютный путь к файлу
        // Создание объекта File, представляющего файл "test.txt"
        File file = new File("C:/Users/alext/OneDrive/Документы/JavaCore/JavaCore/src/" +
                "J_ВводВыводОператорTryСРесурсами/E_ЧтениеФайловИЗаписьВФайлы/Example_3/test.txt");

        // При таком подходе любая ошибка, в том числе и ошибка открытия файла,
        // обрабатывается одним оператором catch.
        try {
            // fin = new FileInputStream(args[0]);
            // new FileInputStream(file) используется для создания нового объекта FileInputStream,
            // который представляет собой поток ввода для чтения данных из файла.
            fis = new FileInputStream(file); // Создание потока FileInputStream для чтения файла
            do {
                // fis.read() в Java - это метод, который вызывается на объекте InputStream,
                // такой как FileInputStream, и предназначен для чтения байта данных из потока ввода.
                i = fis.read();
                if (i != -1) System.out.print((char) i); // Вывод данных из файла на экран
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода: " + e);
        } finally {
            // закрыть файл в любом случае
            try {
                if (fis != null) fis.close(); // Закрытие потока после чтения
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
