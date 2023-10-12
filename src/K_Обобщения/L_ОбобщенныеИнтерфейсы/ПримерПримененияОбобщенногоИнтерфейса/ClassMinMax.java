package K_Обобщения.L_ОбобщенныеИнтерфейсы.ПримерПримененияОбобщенногоИнтерфейса;
// Реализовать обобщенный интерфейс MinMax
public class ClassMinMax<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;


    ClassMinMax(T[] o) {
        vals = o;
    }
    // Метод возвращает минимальное значение из массива vals
    public T min() {
        T v = vals[0];

        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }

        return v;
    }

    // Метод возвращает максимальное значение из массива vals
    public T max() {
        T v = vals[0];

        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }

        return v;
    }
}
