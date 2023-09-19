package F_ПакетыИИнтерфейсы.NestedInterfaces_ВложенныеИнтерфейсы.NestedInterfaces;
// Класс А содержит интерфейс как свой член
public class A {
    // это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}
