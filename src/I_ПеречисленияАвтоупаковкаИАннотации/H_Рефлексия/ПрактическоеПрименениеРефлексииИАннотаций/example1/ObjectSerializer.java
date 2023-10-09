package I_ПеречисленияАвтоупаковкаИАннотации.H_Рефлексия.ПрактическоеПрименениеРефлексииИАннотаций.example1;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class ObjectSerializer {

    private static String serializedName;
    private static Field field;

    public static Map<String, Object> serialize(Object object) throws IllegalAccessException {
        Map<String, Object> serializedMap = new HashMap<>();
        Class<?> objectClass = object.getClass();
        for (Field field : objectClass.getDeclaredFields()) {
            field.setAccessible(true);
            if(field.isAnnotationPresent(Serialize.class)) {
                Serialize serializeAnnotation = field.getAnnotation(Serialize.class);
                String serializedName = serializeAnnotation.value();
                if(serializedName.isEmpty()) {
                    serializedName = field.getName();
                }
                Object value = field.get(object);
                serializedMap.put(serializedName, value);
            }
        }

        return serializedMap;
    }

    public static void deserialize(Object object, Map<String, Object> serializedMap) throws IllegalAccessException {
        Class<?> objectClass = object.getClass();
        for(Field field : objectClass.getDeclaredFields()) {
            field.setAccessible(true);
            if(field.isAnnotationPresent(Serialize.class)) {
                Serialize serializeAnnotation = field.getAnnotation(Serialize.class);
                String serializedName = serializeAnnotation.value();
                if(serializedName.isEmpty()) {
                    serializedName = field.getName();
                }
                Object value = serializedMap.get(serializedName);
                field.set(object, value);
            }
        }
    }
}
