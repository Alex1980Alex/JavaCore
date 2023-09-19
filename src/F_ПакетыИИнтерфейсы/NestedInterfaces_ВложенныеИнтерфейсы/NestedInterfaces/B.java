package F_ПакетыИИнтерфейсы.NestedInterfaces_ВложенныеИнтерфейсы.NestedInterfaces;
// Класс В реализует вложенный интерфейс
public class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
