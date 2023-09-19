package F_ПакетыИИнтерфейсы.StandardInterfaceMethods_СтандартныеМетодыИнтерфейса.DefaultMethod;
// Использовать метод с реализацией по умолчанию
public class DefaultMethMain {
    public static void main(String[] args) {
        MyIFImp1 obj = new MyIFImp1();

        System.out.println(obj.getNumber());

        // Для вызова метода по умолчанию, его не нужно реализовывать в классе MyIFImp
        System.out.println(obj.getString());
    }
}
