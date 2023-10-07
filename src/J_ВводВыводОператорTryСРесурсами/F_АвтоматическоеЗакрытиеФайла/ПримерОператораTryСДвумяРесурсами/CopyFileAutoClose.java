package J_ВводВыводОператорTryСРесурсами.F_АвтоматическоеЗакрытиеФайла.ПримерОператораTryСДвумяРесурсами;
/*
Версия программы CopyFile, в которой демонстрируется
применение оператора try с ресурсами и управление
двумя ресурсами (в данном случае - файлами) в одном операторе try
*/
import java.io.*;
public class CopyFileAutoClose {
    public static void main(String[] args) throws IOException {
        int i;
        /*
        // Проверяем, что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Не указаны имена файлов: откуда куда");
            return;
        }
         */
        // абсолютный путь к файлу
        // Создание объекта File, представляющего файл "first_2.txt" и "second_2.txt"
        File firstFile = new File("C:/Users/alext/OneDrive/Документы/JavaCore/JavaCore/src" +
                "/J_ВводВыводОператорTryСРесурсами/F_АвтоматическоеЗакрытиеФайла/" +
                "ПримерОператораTryСДвумяРесурсами/first_2.txt");
        File secondFile = new File("C:/Users/alext/OneDrive/Документы/JavaCore/JavaCore/src" +
                "/J_ВводВыводОператорTryСРесурсами/F_АвтоматическоеЗакрытиеФайла/" +
                "ПримерОператораTryСДвумяРесурсами/second_2.txt");
        // открыть два файла и управлять ими в операторе try
        // new FileInputStream(firstFile) используется для создания нового объекта FileInputStream,
        // который представляет собой поток ввода для чтения данных из файла.
        // new FileOutputStream(secondFile) используется для создания нового объекта FileOutputStream
        // и связывания его с указанным файлом secondFile.
        // Это позволяет открыть файл для записи данных в него.
        try (FileInputStream fin = new FileInputStream(firstFile);
             FileOutputStream fout = new FileOutputStream(secondFile)) {
            // try (FileInputStream fin = new FileInputStream(args[0]);
            // FileOutputStream fout = new FileOutputStream(args[1])) {

            do {
                i = fin.read(); // читаем файл
                if (i != -1) fout.write(i); // записываем файл
                System.out.println((char)i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
