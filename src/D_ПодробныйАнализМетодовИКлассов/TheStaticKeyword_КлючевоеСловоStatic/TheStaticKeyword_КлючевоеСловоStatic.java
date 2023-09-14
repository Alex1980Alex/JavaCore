package D_ПодробныйАнализМетодовИКлассов.TheStaticKeyword_КлючевоеСловоStatic;

public class TheStaticKeyword_КлючевоеСловоStatic {
    //Статический блок инициализации:
    static {
        System.out.println("Этот код выполняется при загрузке класса.");
    }
    public static void main(String[] args) {
        // Статические переменные (статические поля)
        System.out.println("Статические переменные (статические поля)");
        System.out.println(staticVariable);
        // Статические методы
        System.out.println("Статические методы");
        staticMethod();
    }
    // Статические переменные (статические поля)
    public static int staticVariable = 10;
    // Статические методы
    public static void staticMethod() {
        System.out.println("Это статический метод.");
    }
}
