package I_ПеречисленияАвтоупаковкаИАннотации.C_ПеречисленияJavaЯвляютсяТипамиКлассов.Example;

public class EnumDemo {
    public static void main(String[] args) {
        // У каждой константы перечислимого типа имеется своя копия переменной экземпляра price,
        // поэтому для получения цены на определенный сорт яблок достаточно вызвать метод getPrice()
        System.out.println("Яблoкo сорта " + Apple.valueOf("Winesap")
                + " стоит " + Apple.valueOf("Winesap").getPrice());

        // вывести цены на все сорта яблок
        System.out.println("\nЦeны на все сорта яблок:");
        for (Apple a : Apple.values()) {
            System.out.println(a + " стоит " + a.getPrice());
        }
    }
}
/*
Цены на все сорта яблок получаются при переборе перечисления в цикле for.
Копия переменной экземпляра price существует для каждой константы перечислимого типа, поэтому значение,
связанное с одной константой, отделено и отличается от значения, связанного с другой константой.
Столь эффективный принцип оказывается возможным только благодаря реализации перечислений в виде классов.
--------------------------
Яблoкo сорта Winesap стоит 15

Цeны на все сорта яблок:
Jonathan стоит 10
GoldenDel стоит 9
RedDel стоит 12
Winesap стоит 15
Cortland стоит 8
 */
