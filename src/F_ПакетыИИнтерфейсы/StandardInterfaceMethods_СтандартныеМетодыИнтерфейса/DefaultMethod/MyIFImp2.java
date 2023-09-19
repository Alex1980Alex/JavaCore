package F_ПакетыИИнтерфейсы.StandardInterfaceMethods_СтандартныеМетодыИнтерфейса.DefaultMethod;
// В этом классе предоставляются реализации обоих методов
public class MyIFImp2 implements MyIF {
    // реализация метода
    public int getNumber() {
        System.out.print("Объект типа int возвращает: ");
        return 1;
    }

    // переопределение метода по умолчанию
    public String getString() {
        return "Объект типа String по умолчанию - переопределен!";
    }
}
