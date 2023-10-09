package I_ПеречисленияАвтоупаковкаИАннотации.H_Рефлексия.ПрактическоеПрименениеРефлексииИАннотаций.example1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Serialize {
    String value() default "";
}
