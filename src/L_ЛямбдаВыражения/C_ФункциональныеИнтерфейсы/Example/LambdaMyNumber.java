package L_ЛямбдаВыражения.C_ФункциональныеИнтерфейсы.Example;

public class LambdaMyNumber {
    public static void main(String[] args) {
        // создать ссылку на функциональный интерфейс MyNumber
        MyNumber myNumber;

        // использовать лямбда-выражение в контексте присваивания
        myNumber = () -> 123.45;

        System.out.println(myNumber.getValue());
    }
}
