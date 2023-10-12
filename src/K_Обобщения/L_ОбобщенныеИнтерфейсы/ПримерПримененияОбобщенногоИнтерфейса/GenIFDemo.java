package K_Обобщения.L_ОбобщенныеИнтерфейсы.ПримерПримененияОбобщенногоИнтерфейса;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 2, 6, 1, 8};
        Character[] chrs = {'b', 'r', 'p', 'w', 'k'};

        ClassMinMax iOb = new ClassMinMax<Integer>(inums);
        ClassMinMax cOb = new ClassMinMax<Character>(chrs);

        System.out.println("Maкcимaльнoe значение в массиве inums: " + iOb.max());
        System.out.println("Mинимaльнoe значение в массиве inums: " + iOb.min());

        System.out.println("Maкcимaльнoe значение в массиве chrs: " + cOb.max());
        System.out.println("Mинимaльнoe значение в массиве chrs: " + cOb.min());
    }
}
/* -------------------------------------
Maкcимaльнoe значение в массиве inums: 8
Mинимaльнoe значение в массиве inums: 1
Maкcимaльнoe значение в массиве chrs: w
Mинимaльнoe значение в массиве chrs: b
 */
