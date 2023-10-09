package I_ПеречисленияАвтоупаковкаИАннотации.H_Рефлексия.ПрактическоеПрименениеРефлексииИАннотаций.example2;

import java.lang.reflect.Field;

public class ObjectorValidator {

    public static boolean validate(Object object) throws IllegalAccessException {
        Class<?> objectClass = object.getClass();
        for(Field field: objectClass.getDeclaredFields()) {
            field.setAccessible(true);
            if(field.isAnnotationPresent(Range.class)) {
                Range rangeAnnotation = field.getAnnotation(Range.class);
                int fieldValue = field.getInt(object);

                int min = rangeAnnotation.min();
                int max = rangeAnnotation.max();

                if(fieldValue < min || fieldValue > max) {
                    System.out.println("Validation failed for field " + field.getName() +
                            ". Value out of range " + min + "-" + max);
                    return false;
                }
            }
        }
        return true;
    }
}
