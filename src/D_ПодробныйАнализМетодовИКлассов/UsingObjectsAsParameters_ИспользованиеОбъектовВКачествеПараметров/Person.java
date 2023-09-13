package D_ПодробныйАнализМетодовИКлассов.UsingObjectsAsParameters_ИспользованиеОбъектовВКачествеПараметров;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры для полей name и age

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
