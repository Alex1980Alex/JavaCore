package I_ПеречисленияАвтоупаковкаИАннотации.G_Аннотации.Example_8;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno[] value();
}
