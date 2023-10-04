package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno4 {
    String str() default "Тестирование";
    int val() default 9000;
}
