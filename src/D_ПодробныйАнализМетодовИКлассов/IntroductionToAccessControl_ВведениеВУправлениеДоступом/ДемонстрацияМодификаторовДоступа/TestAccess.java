package D_ПодробныйАнализМетодовИКлассов.IntroductionToAccessControl_ВведениеВУправлениеДоступом.ДемонстрацияМодификаторовДоступа;

public class TestAccess {
    public static void main (String[] args) {
        Test ob = new Test();

        //Эти члены (а и Ь) данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и может вызвать ошибку
        // оЬ.с 100; // ОШИБКА!!!

        // Доступ к члену с данного класса должен осуществляться с помощью методов его класса
        ob.setc(30);

        System.out.println ("ob07.a = " + ob.a + "\n" +
                "ob.b = " + ob.b + "\n" +
                "nob.getc() = " + ob.getc());
    }
}
