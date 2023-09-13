package D_ПодробныйАнализМетодовИКлассов.OverloadingConstructors_ПерегрузкаКонструкторов;

public class Person {
    public String name;
    public int age;

    // Конструктор без параметров
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Конструктор с одним параметром (имя)
    public Person(String name) {
        this.name = name;
        age = 0;
    }

    // Конструктор с двумя параметрами (имя и возраст)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

