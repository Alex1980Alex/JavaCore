package A.literals_Литералы.IntegerLiterals_ЦелочисленныеЛитералы;

public class IntegerLiterals {
    public static void main(String[] args) {
        // Целочисленных литералов типа int:
        System.out.println("Целочисленных литералов типа int:");
        int a = 25;
        System.out.println(a);
        int b = -1000;
        System.out.println(b);
        int c = 073;
        System.out.println(c);
        int d = 0x25;   // шестнадчатеричный
        System.out.println(d);
        int e = 0XF5A;  // шестнадчатеричный
        System.out.println(e);
        int f = 0xabcd; // шестнадчатеричный
        System.out.println(f);

        // целочисленных литералов типа long:
        System.out.println("целочисленных литералов типа long");
        long g = 25L;          // Для указания литерала с типом long добавяют букву "L"
        System.out.println(g);
        long h = 20000000000L; // Для указания литерала с типом long добавяют букву "L"
        System.out.println(h);
        long i = 0L;           // Для указания литерала с типом long добавяют букву "L"
        System.out.println(i);

        // Литерал типа int может присваиваться переменным типов byte, short
        // если значение литерала находится в границах допустимых значений данных типов.
        System.out.println("Литералы типов byte, short");
        byte by;
        short sh;
        by = -20; // работает, число -20 входит в диапазон значений типа byte
        sh = 1000; // работает
        System.out.println(by);
        System.out.println(sh);

        // Использования литералов в восьмеричной и шестнадцатеричной системах исчисления.
        System.out.println("восьмеричная и шестнадцатеричная система исчисления");
        byte byt;
        short sho;
        int k;
        long l;
        // восьмеричная система исчисления
        System.out.println("восьмеричная система исчисления");
        byt = -027;   // -23 в десятичной системе исчисления
        System.out.println(byt);
        sho = 0233;   // 155 в десятичной системе исчисления
        System.out.println(sho);
        k= 03546;   // 1894
        System.out.println(k);
        l = 032451l; // 13609
        System.out.println(l);
        // шестнадцатеричная система исчисления
        System.out.println("шестнадцатеричная система исчисления");
        byt = 0x0f;   // 15 в десятичной системе исчисления
        System.out.println(byt);
        sho = 0XAF;  // 175
        System.out.println(sho);
        k = 0xabcd; // 43981
        System.out.println(k);
        l = 0XaF90FCDEDl; // 47128235501
        System.out.println(l);



    }
}
