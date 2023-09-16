package E_Наследование.CreatingAMulti_levelHierarchy_СозданиеМногоуровневойИерархии.Chapter;

public class DemoShipment05 {
    public static void main(String[] args) {
        BoxCost05 shipment1 = new BoxCost05(2,3,4,1.5,100.00);
        BoxCost05 shipment2 = new BoxCost05(shipment1); // клонируем посылку
        BoxCost05 shipment3 = new BoxCost05(2,1.3,50.00); // куб
        BoxCost05 shipment4 = new BoxCost05(); // посылка без размеров

        double volume; // Объем

        System.out.println("Посылка shipment1. (параллелепипед)");
        volume = shipment1.volume();
        System.out.println("Стоимость\t- " + shipment1.cost +
                "\nОбъем\t\t- " + volume +
                "\nВес\t\t\t- " + shipment1.weight);

        System.out.println("\nПосылка shipment2. (склонированная)");
        volume = shipment2.volume();
        System.out.println("Стоимость\t- " + shipment2.cost +
                "\nОбъем\t\t- " + volume +
                "\nВес\t\t\t- " + shipment2.weight);

        System.out.println("\nПосылка shipment3. (куб)");
        volume = shipment3.volume();
        System.out.println("Стоимость\t- " + shipment3.cost +
                "\nОбъем\t\t- " + volume +
                "\nВес\t\t\t- " + shipment3.weight);

        System.out.println("\nПосылка shipment4. (без параметорв)");
        volume = shipment4.volume();
        System.out.println("Стоимость\t- " + shipment4.cost +
                "\nОбъем\t\t- " + volume +
                "\nВес\t\t\t- " + shipment4.weight);

        System.out.print("\nСравним посылки. (т.е. ссылки на объекты)\nshipment1 = shipment2 , ");
        System.out.println(shipment1 == shipment2);

    }
}
/*-----------------------------------------
Посылка shipment1. (параллелепипед)
Стоимость	- 100.0
Объем		- 24.0
Вес			- 1.5

Посылка shipment2. (склонированная)
Стоимость	- 100.0
Объем		- 24.0
Вес			- 1.5

Посылка shipment3. (куб)
Стоимость	- 50.0
Объем		- 8.0
Вес			- 1.3

Посылка shipment4. (без параметорв)
Стоимость	- -1.0
Объем		- -1.0
Вес			- -1.0

Сравним посылки. (т.е. ссылки на объекты)
shipment1 = shipment2 , false
 */
