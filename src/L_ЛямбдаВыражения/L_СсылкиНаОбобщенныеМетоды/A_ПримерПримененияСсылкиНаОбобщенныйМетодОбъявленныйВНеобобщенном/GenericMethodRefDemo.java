package L_ЛямбдаВыражения.L_СсылкиНаОбобщенныеМетоды.A_ПримерПримененияСсылкиНаОбобщенныйМетодОбъявленныйВНеобобщенном;

public class GenericMethodRefDemo {
    // В качестве первого параметра этого метода указывается функциональный интерфейс MyFunc,
    // а в качестве двух других параметров - массив и значение, причем оба типа Т.
    static <T> int myOp(GenMyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }
    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два", "Четыре", "Три", "Два", "Один"};
        int count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Количество чисел (4) в массиве vals равно: " + count);
        count = myOp(MyArrayOps::<String>countMatching, strs, "Два");
        System.out.println("Количество значений (Два) в массиве strs равно: " + count);
    }
}
/* ----------------------------------------
Количество чисел (4) в массиве vals равно: 3
Количество значений (Два) в массиве strs равно: 3
 */
