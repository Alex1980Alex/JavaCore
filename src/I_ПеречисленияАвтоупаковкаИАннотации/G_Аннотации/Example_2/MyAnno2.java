package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno2 {
    String str();
    int val();
}
