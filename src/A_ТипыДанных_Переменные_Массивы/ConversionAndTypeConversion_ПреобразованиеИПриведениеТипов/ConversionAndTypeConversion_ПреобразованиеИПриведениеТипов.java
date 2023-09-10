package A_ТипыДанных_Переменные_Массивы.ConversionAndTypeConversion_ПреобразованиеИПриведениеТипов;

public class ConversionAndTypeConversion_ПреобразованиеИПриведениеТипов {
    public static void main(String[] args) {
        // Неявное (автоматическое) преобразование:
        System.out.println("Неявное (автоматическое) преобразование");
        int intValue = 10;
        double doubleValue = intValue; // Преобразование int в double

        // Явное (ручное) преобразование:
        System.out.println("Явное (ручное) преобразование");
        double doubleValue_2 = 10.5;
        int intValue_2 = (int) doubleValue_2; // Явное преобразование double в int

        // Приведение типов (Casting):
        double doubleValue_3 = 10.5;
        int intValue_3 = (int) doubleValue_3; // Приведение типа double к int
        // Обратите внимание, что приведение типов может потерять данные,
        // если диапазон нового типа меньше, чем у исходного значения.

        // Преобразование при помощи методов:
        System.out.println("Преобразование при помощи методов");
        String str = "42";
        int intValue_4 = Integer.parseInt(str); // Преобразование строки в int
    }
}
