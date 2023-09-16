package E_Наследование.DispatchingDynamicMethods_ДиспетчеризацииДинамическихМетодов.Chapter;

public class DynamicMethodDispatching {
    public static void main(String[] args) {
        A obA = new A(); // объект класса A
        B obB = new B(); // объект класса B
        C obC = new C(); // объект класса C

        A ref;   // получить ссылку на объект типа А

        ref = obA;
        ref.callme(); // вызвать вариант метода callme(), определенный в классе А

        ref = obB;
        ref.callme(); // вызвать вариант метода callme(), определенный в классе B

        ref = obC;
        ref.callme(); // вызвать вариант метода callme(), определенный в классе C

    }
}
/* -----------------------
Метод callme() из класса A
Метод callme() из класса B
Метод callme() из класса C
 */
