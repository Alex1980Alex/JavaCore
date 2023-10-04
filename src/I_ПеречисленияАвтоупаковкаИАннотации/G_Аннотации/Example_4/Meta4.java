package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_4;

import java.lang.reflect.Method;

public class Meta4 {
    // аннотировать метод, используя значения по умолчанию
    @MyAnno4()
    public static void myMeth() {
        Meta4 ob = new Meta4();

        // получить аннотацию для данного метода и вывести значения ее членов
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno4 anno = m.getAnnotation(MyAnno4.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
/* ----------------
Тестирование 9000
 */
