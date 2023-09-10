package A.Variables_Переменные;

public class ScopeVariables_ОбластьВидимостиПеременных {
    // Область видимости класса, время жизни - до уничтожения объекта
    int instanceVar;
    // Статическая переменная, область видимости класса, время жизни - всё время выполнения программы
    public static int staticVar;
    public void someMethod() {
        // Локальная переменная, область видимости - только внутри метода,
        // время жизни - только во время выполнения метода
        int localVar = 10;
        System.out.println(localVar);
    }

    public static void main(String[] args) {
        ScopeVariables_ОбластьВидимостиПеременных  obj = new ScopeVariables_ОбластьВидимостиПеременных();
        obj.instanceVar = 20;
        staticVar = 30;
        // В этой точке доступны instanceVar и staticVar
    }

}
