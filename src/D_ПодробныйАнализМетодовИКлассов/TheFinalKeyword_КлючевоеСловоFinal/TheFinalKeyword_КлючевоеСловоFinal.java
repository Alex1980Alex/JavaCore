package D_ПодробныйАнализМетодовИКлассов.TheFinalKeyword_КлючевоеСловоFinal;

final public class TheFinalKeyword_КлючевоеСловоFinal {
    // Это не допустимо: class SubClass extends TheFinalKeyword_КлючевоеСловоFinal { }
    public static void main(String[] args) {

    }
    // Финальная переменная (final variable)
    static final int myFinalVariable = 10;

    // Финальный метод (final method)
    public final void finalMethod() {
        // Код метода
    }
    //public class Child extends TheFinalKeyword_КлючевоеСловоFinal {
        // Нельзя переопределить finalMethod() здесь
    //}

    // Финальный аргумент (final argument)
    public void myMethod(final int finalArg) {
        // finalArg не может быть изменено в этом методе
    }
}
