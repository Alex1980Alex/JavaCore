package I_ПеречисленияАвтоупаковкаИАннотации.H_Рефлексия.ПрактическоеПрименениеРефлексииИАннотаций.example2;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person1 = new Person(25, -1);
        Person person2 = new Person(155, 120);

        boolean isPersonValid1 = ObjectorValidator.validate(person1);
        boolean isPersonValid2 = ObjectorValidator.validate(person2);

        System.out.println("Person1 is " + isPersonValid1);
        System.out.println("Person2 is " + isPersonValid2);

    }
}
