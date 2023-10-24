package L_ЛямбдаВыражения.L_СсылкиНаОбобщенныеМетоды.A_ПримерПримененияСсылкиНаОбобщенныйМетодОбъявленныйВНеобобщенном;
// В этом классе определяется метод countMatching(), возвращающий
// количество элементов в массиве, равных указанному значению.
// Метод countMatching() является обобщенным, тогда как класс MyArrayOps - необобщенный.
public class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) count++;
        }
        return count;
    }
}
