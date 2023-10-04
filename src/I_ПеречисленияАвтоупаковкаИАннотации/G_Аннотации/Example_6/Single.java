package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_6;

import java.lang.reflect.Method;

public class Single {
    // аннотировать метод одночленной аннотацией
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value()); // выводит значение 100
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
/* Как и предполагалось, эта программа выводит значение 100.
Здесь одночленная аннотация @MySingle применяется для аннотирования метода myMeth(),
как показано ниже. Обратите внимание на то, что указывать операцию присваивания value = необязательно.

----
100
 */
