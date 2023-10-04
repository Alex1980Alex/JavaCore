package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
// Объявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str();
    int val();
}
