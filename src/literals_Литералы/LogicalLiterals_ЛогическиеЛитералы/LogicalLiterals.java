package literals_Литералы.LogicalLiterals_ЛогическиеЛитералы;

public class LogicalLiterals {
    public static void main(String[] args) {
        //Присвоение логических значений переменным:
        System.out.println("Присвоение логических значений переменным");
        boolean isJavaFun = true;
        System.out.println(isJavaFun);
        boolean isProgrammingHard = false;
        System.out.println(isProgrammingHard);

        //Использование логических литералов в условных операторах:
        System.out.println("Использование логических литералов в условных операторах");
        if (isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun.");
        }

        //Возвращение логических значений из методов:
        System.out.println("Возвращение логических значений из методов");
        System.out.println(isEven(6));

        //Использование логических литералов в выражениях:
        System.out.println("Использование логических литералов в выражениях");
        boolean result = true && false; // result будет равен false
        System.out.println(result);
        boolean anotherResult = true || false; // anotherResult будет равен true
        System.out.println(anotherResult);
    }

    //Возвращение логических значений из методов:
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
