package E_Наследование.CreatingAMulti_levelHierarchy_СозданиеМногоуровневойИерархии.Chapter;

public class Box05 {
    private double width;
    private double height;
    private double depth;

    // Контсруктор клонирует объект
    Box05(Box05 ob05) { // передаемконструтктору объект
        width  = ob05.width;
        height = ob05.height;
        depth  = ob05.depth;
    }

    // Конструктор, применяемый при указании всех размеров
    Box05(double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    // Конструктор, применяемый в отсутствие размеров
    Box05() {
        width  = -1;
        height = -1;
        depth  = -1;
    }

    // Конструктор, применяемый при создании Куба
    Box05(double len) {
        width = height = depth = len;
    }

    // Метод рассчитывает и возвращает объем volume.
    double volume() {
        return width * height * depth;
    }
}
