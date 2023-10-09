package I_ПеречисленияАвтоупаковкаИАннотации.H_Рефлексия.ПрактическоеПрименениеРефлексииИАннотаций.example3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Thomas", 404, "Red Square 1");
        PersonDTO personDTO = new PersonDTO();
        ObjectMapper.mapFields(person1, personDTO);
        System.out.println("PersonDTO - name: " + personDTO.getName());
        System.out.println("PersonDTO - address: " + personDTO.getAddress());
    }
}
