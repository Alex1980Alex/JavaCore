package L_ЛямбдаВыражения.E_БлочныеЛямбдаВыражения.A_ОпределениеФАКТОРИАЛА_ИспользуяЛямбдаВыражение;

public class FactorialUsingLambda {
    public static void main(String[] args) {
        Numeric factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            } return result;
        };

        System.out.println("Факториал числа 3 равен: " + factorial.getNum(3));
        System.out.println("Факториал числа 5 равен: " + factorial.getNum(5));
    }
}
/* -------------------------
Факториал числа 3 равен: 6
Факториал числа 5 равен: 120
 */
