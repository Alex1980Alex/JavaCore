package F_ПакетыИИнтерфейсы.StandardInterfaceMethods_СтандартныеМетодыИнтерфейса.DefaultMethod;

public interface MyIF {
    // Это обычный метод
    int getNumber();

    // Метод с реализацией по умолчанию - он просто возвращает символьную строку
    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
