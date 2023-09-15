package E_Наследование.UsingTheSuperKeyword_ИспользованиеКлючевогоСловаSuper;

public class UsingTheSuperKeyword_ИспользованиеКлючевогоСловаSuper {
    public static void main(String[] args) {
        Animal MyAnimal = new Animal("Bob");
        System.out.println("Моё имя: " + MyAnimal.getName());
        MyAnimal.makeSound();

        Dog MyDog = new Dog("Bim", 5);
        System.out.println("Моё имя: " + MyDog.getName());
        MyDog.makeSound();
    }
}
