package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


@What(description = "Аннотация тестового класса")
@MyAnno3(str = "Meta3", val = 99)
public class Meta3 {
    @What(description = "Аннотация тестового метода")
    @MyAnno3(str = "Тест", val = 100)
    public static void myMeth() {
        Meta3 ob = new Meta3();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            // вывести все аннотации для класса Meta3
            System.out.println("все аннотации для класса Meta3:");
            for (Annotation a : annos) System.out.println(a);
            System.out.println();

            // вывести все аннотации для метода myMeth()
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("все аннотации для метода myMeth():");
            for (Annotation a : annos) System.out.println(a);

        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
