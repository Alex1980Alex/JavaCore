package K_Обобщения.I_ОграниченныеМетасимвольныеАргументы.ПродемонстрироватьОграниченныеМетасимвольныеАргументы;
// Трехмерные координаты
public class ThreeDimension extends TwoDimension{
    int z;
    ThreeDimension(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
