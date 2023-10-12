package K_Обобщения.K_ОбобщенныеКонструкторы.ИспользоватьОбобщенныйКонструктор;

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons iOb = new GenCons(10);
        GenCons dOb = new GenCons(10.2);
        GenCons fOb = new GenCons(12.3F);

        iOb.showval();
        dOb.showval();
        fOb.showval();
    }
}
/* --------------------
val: 10.0
val: 10.2
val: 12.300000190734863
 */
