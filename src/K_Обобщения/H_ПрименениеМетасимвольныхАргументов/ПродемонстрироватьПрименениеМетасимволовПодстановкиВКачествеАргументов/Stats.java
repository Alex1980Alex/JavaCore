package K_Обобщения.H_ПрименениеМетасимвольныхАргументов.ПродемонстрироватьПрименениеМетасимволовПодстановкиВКачествеАргументов;

public class Stats<T extends Number> {
    T[] nums; // массив класса NumЬer или его подкласса

    // передать конструктору ссылку на массив
    // элементов класса Number или его подкласса
    Stats(T[] o) {
        nums = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].byteValue();
        }
        return sum / nums.length;
    }

    // Определить равенство двух средних значений
    // с применением метасимвола подстановки
    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}
