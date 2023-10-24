package L_ЛямбдаВыражения.I_ЛямбдаВыраженияИЗахватПеременных.ИзменениеПеременныхЭкземпляра;

public class MyClass {
    static private int myField = 42;

    static public void doSomething() {
        int localVar = 10;

        Runnable myLambda = () -> {
            // localVar = 20; // Ошибка компиляции
            myField = 100;
            System.out.println(myField);
        };
        myLambda.run();
    }

    public static void main(String[] args) {

        doSomething();
    }
}
