package D_ПодробныйАнализМетодовИКлассов.OverloadingConstructors_ПерегрузкаКонструкторов;

public class OverloadingConstructors_ПерегрузкаКонструкторов {
    public static void main(String[] args) {
        // Перегрузка конструкторов
        System.out.println("Перегрузка конструкторов");
        // Конструктор без параметров
        Person person1 = new Person();
        System.out.println(person1.age + ", " + person1.name);
        // Конструктор с одним параметром
        Person person2 = new Person("Alice");
        System.out.println(person2.age + ", " + person2.name);
        // Конструктор с двумя параметрами
        Person person3 = new Person("Bob", 30);
        System.out.println(person3.age + ", " + person3.name);

    }
}
