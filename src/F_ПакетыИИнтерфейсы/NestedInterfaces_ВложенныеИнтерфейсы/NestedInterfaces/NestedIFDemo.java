package F_ПакетыИИнтерфейсы.NestedInterfaces_ВложенныеИнтерфейсы.NestedInterfaces;

public class NestedIFDemo {
    public static void main(String[] args) {

        // использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");

        if (nif.isNotNegative(-10))
            System.out.println("Это число не будет выведено");
    }
}
/* ---------------------
Число 10 неотрицательное
 */
