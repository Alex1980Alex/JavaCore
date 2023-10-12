package K_Обобщения.I_ОграниченныеМетасимвольныеАргументы.ПродемонстрироватьОграниченныеМетасимвольныеАргументы;
// Четырехмерные координаты
public class FourDimension extends ThreeDimension {
    int t;
    FourDimension(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}
