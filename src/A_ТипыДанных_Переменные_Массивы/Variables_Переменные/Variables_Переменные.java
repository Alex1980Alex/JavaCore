package A_ТипыДанных_Переменные_Массивы.Variables_Переменные;

import java.util.ArrayList;

public class Variables_Переменные {

    // Статические поля (Static Variables)
    static int staticVar; // Статическое поле класса
    public static void main(String[] args) {

        System.out.println ( "Инициализация переменных");
        // Переменная с инициализируется динамически.
        double a = 3.0 , b = 4.0 ;
        // Переменная с инициализируется константами.
        double с = Math.sqrt (a * a + b * b ) ;
        System.out.println ( "Длина гипотенузы равна " + с );

        // Локальные переменные (Local Variables)
        System.out.println("Локальные переменные");
        int localVar = 10; // Локальная переменная
        System.out.println(localVar);

        // Поля класса (Instance Variables)
        int instanceVar; // Поле класса (переменная экземпляра)

        // Финальные переменные (Final Variables)
        final int constantVar = 100; // Финальная переменная

        // Локальное объявление переменных с неявным определением типа (var)
        var number = 42; // Определяет тип как int
        var name = "John"; // Определяет тип как String
        var myList = new ArrayList<String>(); // Определяет тип как ArrayList<String>
    }
    public void someMethod(int parameter) {
        System.out.println(parameter); // Параметр метода
    }
}
