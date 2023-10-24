package L_ЛямбдаВыражения.M_СсылкиНаКонструкторы.B_РеализоватьПростуюФабрикуКлассовИспользуяСсылкуНаКонструктор;

public class FactoryConstructorRefDemo {
    // ФАБРИЧНЫЙ метод для объектов разных классов.
    // У каждого класса должен быть свой конструктор, принимающий один параметр типа Т.
    // А параметр R обозначает тип создаваемого объекта.
    static <R, T> R myClassFactory(GenMyFunc<R, T> constr, T v) {
        return constr.func(v);
    }
    public static void main(String[] args) {
        // Создадим ссылку на конструктор класса GenMyClass.
        // Здесь в операции new вызывается конструктор, принимающий аргумент
        GenMyFunc<GenMyClass<Double>, Double> myClassCons = GenMyClass<Double>::new;

        // Создадим экземпляр типа класса GenMyClass, используя ФАБРИЧНЫЙ метод
        GenMyClass<Double> mcOb = myClassFactory(myClassCons, 88.8);

        // Используем созданный экземпляр класса GenMyClass
        System.out.println("Значение val в объекте mcOb равно: " + mcOb.getVal());

        // Создадим экземпляр класса MyClass2, используя метод myClassFactory()
        GenMyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        // Создадим экземпляр класса MyClass2, используя ФАБРИЧНЫЙ метод
        MyClass2 mcOb2 = myClassFactory(myClassCons2, "Строку");

        // Используем созданный экземпляр класса MyClass2
        System.out.println("Значение str в объекте mcOb2 содержит: " + mcOb2.getStr());
    }
}
