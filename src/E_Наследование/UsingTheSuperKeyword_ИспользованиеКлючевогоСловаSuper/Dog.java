package E_Наследование.UsingTheSuperKeyword_ИспользованиеКлючевогоСловаSuper;

public class Dog extends Animal {
    int age;

    Dog(String name, int age) {
        super(name); // Вызов конструктора суперкласса
        this.age = age;
    }

    @Override
    public void makeSound() {
        super.makeSound(); // Вызов метода суперкласса
        System.out.println("Dog barks");
    }
}

// В этом примере конструктор Dog вызывает конструктор Animal с помощью super(name)
// для инициализации имени животного.
// метод makeSound() класса Dog вызывает версию метода makeSound() суперкласса
// с помощью super.makeSound() перед добавлением своего собственного поведения.
