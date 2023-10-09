package J_ВводВыводОператорTryСРесурсами.I_ВведениеВInstanceof.ПримерИспользованияInstanceof;


    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}

    public class Example {
        public static void main(String[] args) {
            Animal myDog = new Dog();
            Animal myCat = new Cat();

            System.out.println(myDog instanceof Animal); // true, myDog - экземпляр класса Animal
            System.out.println(myDog instanceof Dog);    // true, myDog - экземпляр класса Dog
            System.out.println(myCat instanceof Animal); // true, myCat - экземпляр класса Animal
            System.out.println(myCat instanceof Cat);    // true, myCat - экземпляр класса Cat
            System.out.println(myDog instanceof Cat);    // false, myDog не является экземпляром класса Cat
        }
    }
