package E_Наследование.CreatingAMulti_levelHierarchy_СозданиеМногоуровневойИерархии.Chapter;

public class BoxWeight05 extends Box05 {
    double weight; // Вес

    // Контсруктор клонирует объект
    BoxWeight05(BoxWeight05 ob05) {
        super(ob05);
        weight = ob05.weight;
    }

    // Конструктор, применяемый при указании всех размеров
    BoxWeight05(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // Конструктор, применяемый в отсутствие размеров
    BoxWeight05(){
        super();
        weight = -1;
    }

    // Конструктор, применяемый при создании Куба
    BoxWeight05(double len, double m) {
        super(len);
        weight = m;
    }
}
