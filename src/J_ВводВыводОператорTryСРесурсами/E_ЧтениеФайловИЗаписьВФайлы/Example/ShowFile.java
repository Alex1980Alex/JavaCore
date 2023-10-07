package J_ВводВыводОператорTryСРесурсами.E_ЧтениеФайловИЗаписьВФайлы.Example;
/*
Отображение содержимого текстового файла.
Чтобы воспользоваться этой программой, укажите
имя файла, который требуется просмотреть.
Например, чтобы просмотреть файл TEST.TXT,
введите в командной строке следующую команду:

java ShowFile test.txt
*/
import java.io.*;
//Отображение содержимого текстового файла
public class ShowFile {
    public static void main(String[] args) {
        int i;
        // FileInputStream это класс, предназначенный для чтения данных из файла.
        // Он является частью пакета java.io,
        // который предоставляет классы и методы для работы с потоками ввода-вывода.
        // FileInputStream наследует функциональность от класса InputStream и позволяет открывать
        // файл и читать данные из него байтами. Когда файл открывается с помощью
        FileInputStream fin;


        // Сначала проверяем, что имя файла указано
        /*
        if (args.length != 1) {
            System.out.println("Использование: ShowFile.main имя_файла");
            System.out.println("Не указано: имя_файла");
            return;
        }
         */

        // абсолютный путь к файлу
        // Создание объекта File, представляющего файл "test.txt"
        File file = new File("C:/Users/alext/OneDrive/Документы/JavaCore/JavaCore/src/" +
                "J_ВводВыводОператорTryСРесурсами/E_ЧтениеФайловИЗаписьВФайлы/Example/test.txt");
        try {
           // fin = new FileInputStream(args[0]);
            // new FileInputStream(file) используется для создания нового объекта FileInputStream,
            // который представляет собой поток ввода для чтения данных из файла.
            fin = new FileInputStream(file); // Создание потока FileInputStream для чтения файла
        } catch (FileNotFoundException e) {
            System.out.println("Heвoзмoжнo открыть файл");
            return;
        }

        // Теперь файл открыт и готов к чтению.
        // Далее из него читаются символы до тех пор, пока не встретится признак конца файла
        try {
            do {
                // fin.read() в Java - это метод, который вызывается на объекте InputStream,
                // такой как FileInputStream, и предназначен для чтения байта данных из потока ввода.
                i = fin.read();
                if (i != -1) System.out.print((char) i); // Вывод данных из файла на экран
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Oшибкa чтения из файла");

            //  если выполнение кода, в котором происходит обращение к файлу, прекращается из-за каких-нибудь исключений,
            //  не связанных с операциями ввода-вывода, то файл все равно будет закрыт в блоке оператора finally
        } finally {

            // закрыть файл при выходе из блока оператора try
            try {
                fin.close(); // Закрытие потока после чтения
            } catch (IOException e) {
                System.out.println("При ошибке закрытия файла");
            }
        }

        // Закрываем файл
        try {
            fin.close(); // Закрытие потока после чтения
        } catch (IOException e) {
            System.out.println("Oшибкa закрытия файла");
        }

    }
}
