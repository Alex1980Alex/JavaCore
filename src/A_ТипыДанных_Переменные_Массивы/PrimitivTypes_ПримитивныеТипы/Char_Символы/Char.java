package A_ТипыДанных_Переменные_Массивы.PrimitivTypes_ПримитивныеТипы.Char_Символы;

public class Char {
    public static void main(String[] args) {
        // char является 16-битным с диапазоном значений от О до 65 535
        // Отрицательных значений для типа char не существует
        System.out.println("Примеры char");
        char zahl = 100;       // Сотый по счёту символ в таблице
        System.out.println(zahl);
        char octal = '\u039A'; // Вызов определённого символа кодом
        System.out.println(octal);
        char zeichen = 'A';    // Буква A
        System.out.println(zeichen);
        char tabulator = '\t'; // В русском языке клавиша называется "Таб" -> Табулятор
        System.out.println("Таб ->" + tabulator + "<- Таб");
        char phi = '\u03A6';   // Греческая буквая Фита - PHI
        System.out.println(phi);

        // Переменные char ведут себя подобно целым числам.
        System.out.println("Переменные char ведут себя подобно целым числам");
        char chl;
        chl = 'Х' ;
        System.out.println( "chl содержит " + chl );
        chl++ ; // инкрементировать chl
        System.out.println( "chl теперь содержит " + chl );

        //Управляющие последовательности
        System.out.println("Управляющие последовательности");
        System.out.println("prog\tlang.su --> \\t - табуляция");
        System.out.println("prog\blang.su --> \\b - возврат на один шаг назад");
        System.out.println("prog\nlang.su --> \\n - новая строка");
        System.out.println("prog\rlang.su --> \\r - возврат каретки");
        System.out.println("prog\flang.su --> \\f - прогон страницы");
        System.out.println("prog\'lang.su --> \\' - одинарная кавычка");
        System.out.println("prog\"lang.su --> \\\" - двойная кавычка");
        System.out.println("prog\\lang.su --> \\\\ - обратная косая черта");

    }
}
