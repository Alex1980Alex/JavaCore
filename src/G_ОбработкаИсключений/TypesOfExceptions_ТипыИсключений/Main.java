package G_ОбработкаИсключений.TypesOfExceptions_ТипыИсключений;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        // Пример обработки проверяемых исключений:
        try {
            FileReader fileReader = new FileReader("example.txt");
            // Код для работы с файлом
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода.");
        }

        // Пример обработки непроверяемых исключений:
        int[] arr = {1, 2, 3};
        try {
            int result = arr[5] / 0; // Приведет к ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс вне диапазона массива.");
        }

    }
}
