package E_Наследование.UsingTheSuperKeyword_ИспользованиеКлючевогоСловаSuper;

public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
