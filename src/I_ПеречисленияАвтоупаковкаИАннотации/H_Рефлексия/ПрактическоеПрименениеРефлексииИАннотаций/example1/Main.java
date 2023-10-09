package I_ПеречисленияАвтоупаковкаИАннотации.H_Рефлексия.ПрактическоеПрименениеРефлексииИАннотаций.example1;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("Tom", 30);
        Map<String, Object> serializedData = ObjectSerializer.serialize(person);
        System.out.println("Serialized Data: " + serializedData);
        Person deserializedPerson = new Person("", 0);
        ObjectSerializer.deserialize(deserializedPerson, serializedData);
        System.out.println("Deserialized Person: " + deserializedPerson.getName() + ", " + deserializedPerson.getAge());

    }
}