package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_8;
// Продемонстрировать применение повторяющейся аннотации

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno_2 {
    // повторить аннотацию MyAnno в методе myMeth()
    @MyAnno(str = "Первая аннотация", val = -1)
    @MyAnno(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno_2 ob = new RepeatAnno_2();

        try {
            Class<?> c = ob.getClass();

            // получить аннотации для метода myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);

            // вывести повторяющиеся аннотации MyAnno
            Annotation[] annos = m.getAnnotationsByType(MyAnno.class) ;
            for (Annotation a: annos )
                System.out.println (a);
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден");
        }
    }

    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}
/*
Как пояснялось ранее, чтобы сделать аннотацию MyAnno повторяющейся, ее нужно снабдить аннотацией @RepeataЬle,
указывающей ее контейнерную аннотацию, которая называется MyRepeatedAnnos. В данной программе для доступа
к повторяющимся аннотациям вызывается метод getAnnotation(), которому передается класс контейнерной аннотации,
а не самой повторяющейся аннотации. Как следует из результата выполнения данной программы,
повторяющиеся аннотации разделяются запятой. Они не возвращаются по отдельности.
---------------------------------------------------
@Chapter12.Package06.MyRepeatedAnnos(value=[@Chapter12.Package06.MyAnno(val=-1, str=Первая аннотация),
                                            @Chapter12.Package06.MyAnno(val=100, str=Вторая аннотация)])
 */
