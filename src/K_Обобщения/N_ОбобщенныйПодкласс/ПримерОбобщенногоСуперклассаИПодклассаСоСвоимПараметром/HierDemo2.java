package K_Обобщения.N_ОбобщенныйПодкласс.ПримерОбобщенногоСуперклассаИПодклассаСоСвоимПараметром;

public class HierDemo2 {
    public static void main(String[] args) {
        // создать объект типа Gen для символьных строк
        Gen<String> wOb = new Gen<String>("Значение: ", 99);
        System.out.print(wOb.getOb());
        System.out.println(wOb.getNum());
    }
}
/* ---------
Значение: 99
 */
