package E_Наследование.CreatingAMulti_levelHierarchy_СозданиеМногоуровневойИерархии.Chapter;

public class BoxCost05 extends BoxWeight05{ double cost; // Стоимость

    // Контсруктор клонирует объект
    BoxCost05(BoxCost05 ob05) {
        super(ob05);
        cost = ob05.cost;
    }

    // Конструктор, применяемый при указании всех размеров
    BoxCost05(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // Конструктор, применяемый в отсутствие размеров
    BoxCost05() {
        super();
        cost = -1;
    }

    // Конструктор, применяемый при создании Куба
    BoxCost05(double len, double m, double c) {
        super(len, m);
        cost = c;
    }

}
