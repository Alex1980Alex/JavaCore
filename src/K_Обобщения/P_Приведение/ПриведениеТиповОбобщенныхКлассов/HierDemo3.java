package K_Обобщения.P_Приведение.ПриведениеТиповОбобщенныхКлассов;

public class HierDemo3 {
    public static void main(String[] args) {
        // создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<Integer>(88);

        // создать объект типа Gen2 для целых чисел
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // создать объект типа Gen2 для символьных строк
        Gen2<String> sOb2 = new Gen2<String>("Символьная строка");

        System.out.println(iOb2.getClass().getSimpleName());
        iOb2.getOb();
        System.out.println("--------------");

        Gen<Integer> iOb3 = (Gen<Integer>) iOb2; // Приведение типа допустимо
        System.out.println(iOb3.getOb());
        System.out.println(iOb3.getClass().getSimpleName());

        /*
        Gen iOb4 = (Gen<Long>) iOb2; //недопустимо
        System.out.println(iOb4.getOb());
         */


    }
}
