package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_6;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Одночленная аннотация
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value(); // эта переменная должна иметь имя value
}
