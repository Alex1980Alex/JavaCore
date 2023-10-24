package L_ЛямбдаВыражения.I_ЛямбдаВыраженияИЗахватПеременных.B_ИспользованиеПеременныхЭкземпляраВЛямбдаВыражениях;

public class MyClass {
    static int myField = 42;
    static void doSomething() {
        Runnable myLambda = () -> {
            // Разрешено, если myField - финальное или эффективно финальное
            System.out.println(myField);
        };
        myLambda.run();
    }
    public static void main(String[] args) {
        doSomething();
    }

}
