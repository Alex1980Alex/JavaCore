package K_Обобщения.E_ОбобщенныйКлассСДвумяПараметрамиТипов.ПродемонстрироватьПрименениеКлассаТwoGen;
// продемонстрировать применение класса ТWoGen
public class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(12345678,"текстовая строка");

        // показать типы
        tgObj.showType();

        // Получить и показать значения
        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }
}
/* -----------------------
Тип T: java.lang.Integer
Тип V: java.lang.String
Значение: 12345678
Значение: текстовая строка
 */
