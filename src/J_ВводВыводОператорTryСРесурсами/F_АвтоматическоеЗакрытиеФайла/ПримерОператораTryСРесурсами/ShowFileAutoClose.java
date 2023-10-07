package J_ВводВыводОператорTryСРесурсами.F_АвтоматическоеЗакрытиеФайла.ПримерОператораTryСРесурсами;
/*
В этой версии программы ShowFile
оператор try с ресурсами применяется
для автоматического закрытия файла
*/
import java.io.*;
public class ShowFileAutoClose {
    public static void main(String[] args) {
        int i;

        /*
        // Проверяем, что указано имя файла
        if (args.length != 1) {
            System.out.println("Не указано: имя_файла");
            return;
        }
         */
        // абсолютный путь к файлу
        // Создание объекта File, представляющего файл "first.txt" и "second.txt"
        File testFile = new File("C:/Users/alext/OneDrive/Документы/JavaCore/JavaCore/src" +
                "/J_ВводВыводОператорTryСРесурсами/F_АвтоматическоеЗакрытиеФайла" +
                "/ПримерОператораTryСРесурсами/test.txt");

        // оператор try с ресурсами применяется сначала для открытия,
        // а затем для автоматического закрытия файла по завершении блока этого оператора
        // FileInputStream в Java - это класс, предназначенный для чтения байтовых данных из файла.
        // Он является частью пакета java.io и используется для открытия файла и последующего
        // чтения его содержимого.
        try (FileInputStream fin = new FileInputStream(testFile)) {
            //try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                //  используется для чтения одного байта из потока ввода,
                //  на который указывает FileInputStream
                i = fin.read();
                // i содержит байт данных, который мы можем обработать
                if (i != -1) System.out.print((char) i); // Вывод данных из файла на экран
            } while (i != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
