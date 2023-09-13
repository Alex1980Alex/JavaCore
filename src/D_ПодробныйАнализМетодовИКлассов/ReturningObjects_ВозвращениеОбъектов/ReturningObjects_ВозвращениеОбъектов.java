package D_ПодробныйАнализМетодовИКлассов.ReturningObjects_ВозвращениеОбъектов;

public class ReturningObjects_ВозвращениеОбъектов {
    public static void main(String[] args) {
        // Возвращение объектов
        System.out.println("Возвращение объектов");

        PersonFactory factory = new PersonFactory();

        // Создание объекта Person с использованием метода createPerson
        Person person = factory.createPerson("Alice", 30);

        // Использование созданного объекта
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());

        // В этом примере метод createPerson в классе PersonFactory создает
        // и возвращает объект класса Person.
        // Затем этот объект сохраняется в переменной person,
        // и вы можете работать с ним, используя его методы и поля.
    }
}
