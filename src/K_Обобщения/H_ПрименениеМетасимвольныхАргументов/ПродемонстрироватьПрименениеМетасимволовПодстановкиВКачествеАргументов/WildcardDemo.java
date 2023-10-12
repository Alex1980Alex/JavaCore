package K_Обобщения.H_ПрименениеМетасимвольныхАргументов.ПродемонстрироватьПрименениеМетасимволовПодстановкиВКачествеАргументов;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double avgi = iob.average();
        System.out.println("Cpeднee значение iob равно: " + avgi);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double avgd = dob.average();
        System.out.println("Cpeднee значение dob равно: " + avgd);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double avgf = fob.average();
        System.out.println("Cpeднee значение fob равно: " + avgf);

        // Проверить, какие массивы имеют одинаковые средние значения
        System.out.print("Cpeдниe значения iob и dob: ");
        if (iob.sameAvg(dob)) {
            System.out.println("равны");
        } else {
            System.out.println("НЕ равны");
        }

        System.out.print("Cpeдниe значения iob и fob: ");
        if (iob.sameAvg(fob)) {
            System.out.println("одинаковы");
        } else {
            System.out.println("отличаются");
        }
    }
}
