package L_ЛямбдаВыражения.J_СсылкиНаСтатическиеМетоды.ПродемонстрироватьСсылкуНаСтатическийМетод;
// В этом классе определяется статический метод strReverse()
public class MyStringOps {
    // Статический метод, изменяющий порядок следования символов в строке
    static String strReverse(String str) {
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
