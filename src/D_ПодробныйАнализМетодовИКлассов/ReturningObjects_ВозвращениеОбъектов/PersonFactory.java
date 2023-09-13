package D_ПодробныйАнализМетодовИКлассов.ReturningObjects_ВозвращениеОбъектов;

public class PersonFactory {
    public Person createPerson(String name, int age) {
        // Создание объекта Person и его возвращение
        return new Person(name, age);
    }
}
