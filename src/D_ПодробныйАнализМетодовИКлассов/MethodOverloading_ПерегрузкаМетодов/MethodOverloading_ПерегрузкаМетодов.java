package D_ПодробныйАнализМетодовИКлассов.MethodOverloading_ПерегрузкаМетодов;

public class MethodOverloading_ПерегрузкаМетодов {
    public static void main(String[] args) {

        // Перегрузка методов
        System.out.println("Перегрузка методов");
        Calculator calculator = new Calculator();
        // Вызывается версия с двумя целыми числами.
        int sumInt = calculator.add(2, 3);
        System.out.println(sumInt);
        // Вызывается версия с двойными числами.
        double sumDouble = calculator.add(2.5, 3.7);
        System.out.println(sumDouble);
        // Вызывается версия с двумя строками.
        String concatStrings = calculator.add("Hello, ", "world!");
        System.out.println(concatStrings);

    }
}
