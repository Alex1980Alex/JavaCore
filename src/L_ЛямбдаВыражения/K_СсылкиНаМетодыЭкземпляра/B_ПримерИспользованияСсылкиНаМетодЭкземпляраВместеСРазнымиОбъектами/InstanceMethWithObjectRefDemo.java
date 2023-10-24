package L_ЛямбдаВыражения.K_СсылкиНаМетодыЭкземпляра.B_ПримерИспользованияСсылкиНаМетодЭкземпляраВместеСРазнымиОбъектами;

public class InstanceMethWithObjectRefDemo {
    // Метод, возвращает количество экземпляров объекта,
    // найденных по критериям, задаваемым параметром
    // функционального интерфейса MyFunc.
    static <T> int counter (T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int count;

        // Создадим массив объектов типа HighTemp.
        HighTemp[] weekDayHighs = { new HighTemp(29), new HighTemp(22), new HighTemp(30),
                new HighTemp(28), new HighTemp(31), new HighTemp(32),
                new HighTemp(24), new HighTemp(29), new HighTemp(29) };

        // Использовать метод counter() вместе с массивами объектов типа HighTemp.
        // Ссылка на метод экземпляра sameTemp() передается в качестве второго параметра.
        //В такой форме первый параметр функционального интерфейса соответствует вызываемому объекту (HighTemp),
        //а второй - параметру, заданному методом (sameTemp)
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(29));
        System.out.println("Количество дней с максимальной температурой (29): " + count);

        //Далее создадим и используем вместе с данным методом еще один массив объектов типа HighTemp.
        HighTemp[] weekDayHighs2 = { new HighTemp(11), new HighTemp(12), new HighTemp(13),
                new HighTemp(18), new HighTemp(21), new HighTemp(12),
                new HighTemp(14), new HighTemp(19), new HighTemp(19) };

        //В такой форме первый параметр функционального интерфейса соответствует вызываемому объекту (HighTemp),
        //а второй - параметру, заданному методом (sameTemp)
        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Количество дней с максимальной температурой (12): " + count);

        // Воспользуемся методом lessThanTemp(), чтобы выяснить,
        // сколько дней температура была меньше заданной.
        //В такой форме первый параметр функционального интерфейса соответствует вызываемому объекту (HighTemp),
        //а второй - параметру, заданному методом (sameTemp)
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(29));
        System.out.println("Количество дней с температурой меньше (29): " + count);

        //В такой форме первый параметр функционального интерфейса соответствует вызываемому объекту (HighTemp),
        //а второй - параметру, заданному методом (sameTemp)
        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(12));
        System.out.println("Количество дней с температурой меньше (12): " + count);
    }
}
/* ------------------------------------------------
Количество дней с максимальной температурой (29): 3
Количество дней с максимальной температурой (12): 2
Количество дней с температурой меньше (29): 3
Количество дней с температурой меньше (12): 1
 */
