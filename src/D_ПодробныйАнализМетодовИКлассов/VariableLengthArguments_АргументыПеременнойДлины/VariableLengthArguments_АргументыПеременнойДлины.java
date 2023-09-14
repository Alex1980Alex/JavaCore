package D_ПодробныйАнализМетодовИКлассов.VariableLengthArguments_АргументыПеременнойДлины;

public class VariableLengthArguments_АргументыПеременнойДлины {
    public static void main(String[] args) {
        // Использование массива для передачи методу произвольного числа аргументов .
        // Это подход в старом стиле к аргументам переменной длины .
        // Обратите внимание на порядок создания массива для хранения аргументов
        System.out.println("подход в старом стиле к аргументам переменной длины");
        int n1[] = { 10 };
        int n2[] = { 1, 2, 3 };
        int n3[] = { };
        vaTest(n1); // 1 аргумент
        vaTest(n2); // 3 аргумента
        vaTest(n3); // без аргументов

        // !!! Обратите внимание на возможные способы
        // вызова метода vaTest() с аргументами переменной длины
        System.out.println("вызова метода vaTest() с аргументами переменной длины");
        vaTest2(10);      // один аргумент
        vaTest2(1, 2, 3); // три аргумента
        vaTest2();            // без агрументов

        //Аргументы переменной длины и перегрузка
        System.out.println("Аргументы переменной длины и перегрузка");
        vaTest3(1, 2, 3);
        vaTest3(true, false, true);
        vaTest3("Проверка: ", 10, 20);

    }

    static void vaTest(int v[]) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    // теперь метод vaTest2() объявляется с аргументами переменной длины
    static void vaTest2(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }

    //Аргументы переменной длины и перегрузка
    static void vaTest3(int ... v) {
        System.out.print("vaTest(int ... v): "
                + "Количество аргументов: "
                + v.length + " Содержимое: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest3(boolean ... v) {
        System.out.print("vaTest(boolean ... v): "
                + "Количество аргументов: "
                + v.length + " Содержимое: ");
        for (boolean x : v) System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest3(String msg, int ... v) {
        System.out.print("vaTest(String msg, int ... v): "
                + "Количество аргументов: "
                + msg + v.length + " Содержимое: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }
}
