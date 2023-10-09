package I_ПеречисленияАвтоупаковкаИАннотации.H_Рефлексия.ПрактическоеПрименениеРефлексииИАннотаций.example3;

import java.lang.reflect.Field;

public class ObjectMapper {

    public static void mapFields(Object source, Object destination) {
        Class<?> sourceClass = source.getClass();
        Class<?> destinationClass = destination.getClass();

        for (Field sourceField : sourceClass.getDeclaredFields()) {
            String sourceFieldName = sourceField.getName();

            try {
                Field destinationField = destinationClass.getDeclaredField(sourceFieldName);
                sourceField.setAccessible(true);
                destinationField.setAccessible(true);

                Object value = sourceField.get(source);
                destinationField.set(destination, value);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }


        }
    }
}
