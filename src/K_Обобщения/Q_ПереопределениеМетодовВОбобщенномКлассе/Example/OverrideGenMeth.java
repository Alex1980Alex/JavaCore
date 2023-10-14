package K_Обобщения.Q_ПереопределениеМетодовВОбобщенномКлассе.Example;

public class OverrideGenMeth {
    public static void main(String[] args) {
        // создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<Integer>(88);

        // создать объект типа Gеn2 для целых чисел
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // создать объект типа Gen2 для символьных строк
        Gen2<String> sOb2 = new Gen2<String>("Символьная строка");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(sOb2.getOb());
    }
}
/* --------------------------------------------
88
Meтoд getOb() из класса Gen2: 99
Meтoд getOb() из класса Gen2: Символьная строка
 */
