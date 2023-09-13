package D_ПодробныйАнализМетодовИКлассов.UsingObjectsAsParameters_ИспользованиеОбъектовВКачествеПараметров;

public class UsingObjectsAsParameters_ИспользованиеОбъектовВКачествеПараметров {
    public static void main(String[] args) {
        // Использование объектов в качестве параметров
        System.out.println("Использование объектов в качестве параметров ");
        // Создание объекта Person
        Person person = new Person("Alice", 30);

        // Создание объекта PersonProcessor
        PersonProcessor processor = new PersonProcessor();

        // Передача объекта Person в метод processPerson
        processor.processPerson(person);

        // -------------------------------------------

        // создадим параллелепипеды используя разные конструкторы
        System.out.println("создадим параллелепипеды используя разные конструкторы");
        Box mybox1 = new Box (10, 20, 15);
        Box mybox2 = new Box ();
        Box mycube = new Box (7);

        // Создадим копию объекта mybox1
        System.out.println("Создадим копию объекта mybox1");
        Box myclone = new Box (mybox1);

        System.out.println("Объем (mybox1): " + mybox1.volume());
        System.out.println("Объем (mybox2): " + mybox2.volume());
        System.out.println("Объем (mycube): " + mycube.volume());
        System.out.println("Объем клона (myclone): " + myclone.volume());
    }

}
