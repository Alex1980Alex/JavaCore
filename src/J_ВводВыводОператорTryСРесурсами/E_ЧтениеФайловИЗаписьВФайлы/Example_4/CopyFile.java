package J_ВводВыводОператорTryСРесурсами.E_ЧтениеФайловИЗаписьВФайлы.Example_4;
/*
Копирование файла.
Чтобы воспользоваться этой программой, укажите
имена исходного и целевого файлов.
Например, чтобы скопировать файл FIRST.TXT
в файл SECOND.TXT, введите в командной строке
следующую команду:

java CopyFile FIRST.TXT SECOND.TXT
 */
import java.io.*;
public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        // FileInputStream это класс, предназначенный для чтения данных из файла.
        // Он является частью пакета java.io,
        // который предоставляет классы и методы для работы с потоками ввода-вывода.
        // FileInputStream наследует функциональность от класса InputStream и позволяет открывать
        // файл и читать данные из него байтами. Когда файл открывается с помощью
        FileInputStream fin = null;
        // FileOutputStream это класс, предназначенный для записи данных в файл.
        // Он также является частью пакета java.io, который предоставляет классы
        // и методы для работы с потоками ввода-вывода.
        // FileOutputStream позволяет открыть файл для записи и записывать в него байты данных.
        // Когда файл открывается с помощью FileOutputStream,
        FileOutputStream fout = null;
        /*
        // Проверяем, что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Не указаны имена файлов: откуда куда");
            return;
        }
         */

        // абсолютный путь к файлу
        // Создание объекта File, представляющего файл "first.txt" и "second.txt"
        File firstFile = new File("C:/Users/alext/OneDrive/Документы/JavaCore/JavaCore/src/" +
                "J_ВводВыводОператорTryСРесурсами/E_ЧтениеФайловИЗаписьВФайлы/Example_4/first.txt");
        File secondFile = new File("C:/Users/alext/OneDrive/Документы/JavaCore/JavaCore/src/" +
                "J_ВводВыводОператорTryСРесурсами/E_ЧтениеФайловИЗаписьВФайлы/Example_4/second.txt");

        // копировать файл
        try {
            // пробуем открыть файлы
            //fin = new FileInputStream(args[0]);
            // new FileInputStream(firstFile) используется для создания нового объекта FileInputStream,
            // который представляет собой поток ввода для чтения данных из файла.
            fin = new FileInputStream(firstFile);
            //fout = new FileOutputStream(args[1]);
            // new FileOutputStream(secondFile) используется для создания нового объекта FileOutputStream
            // и связывания его с указанным файлом secondFile.
            // Это позволяет открыть файл для записи данных в него.
            fout = new FileOutputStream(secondFile);

            do {
                i = fin.read(); // читаем файл
                if (i != -1) fout.write(i); // записываем файл
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода: " + e);
        } finally {
            try {
                if (fin != null) fin.close(); // Закрытие потока после чтения
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                if (fout != null) fout.close(); // Закрытие потока после записи
            } catch (IOException e3) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
