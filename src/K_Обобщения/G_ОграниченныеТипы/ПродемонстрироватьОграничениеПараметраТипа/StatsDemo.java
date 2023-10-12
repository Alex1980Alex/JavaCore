package K_Обобщения.G_ОграниченныеТипы.ПродемонстрироватьОграничениеПараметраТипа;

public class StatsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.average();
        System.out.println("Cpeднee значение iOb равно: " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<Double>(dnums);
        double w = dOb.average();
        System.out.println("Cpeднee значение dOb равно: " + w);

        // Этот код не скомпилируется, так как класс String
        // не является производным от класса Number
        // String strs[] = { "1", "2", "3", "4", "5" };
        // Stats<String> strob = new Stats<String>(strs);
        // douЫe х = strob.average();
        // System.out.println("Cpeднee значение strob равно " + v);
    }
}
/* ----------------------------
Cpeднee значение iOb равно: 3.0
Cpeднee значение dOb равно: 3.3
 */
