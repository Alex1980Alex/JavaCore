package K_Обобщения.A_ЧтоТакоеОбобщения.ПростойПримерОбобщения;
// Класс GenDemo служит для демонстрации обобщенного класса Gen.
public class GenDemo {
    public static void main(String[] args) {

        // <Integer> - это аргумент типа, который передается в качестве параметра типа Т из класса Gen
        // Это объявление фактически означает создание версии класса Gen, где все ссылки на
        // тип Т преобразуются в ссылки на тип Integer.

        Gen<Integer> iOb; // Создать ссылку типа Gen для целых чисел

        // Переменной iOb присваивается ссылка на экземпляр целочисленной версии класса Gen
        // Ссылка, возвращаемая операцией new, также должна относиться к типу Gen<Integer>.
        iOb = new Gen<Integer>(12345678); // Создать объект типа Gen<Integer> и присвоить ссылку на него переменной iOb

        // показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        // Получить значение переменной iOb.
        // Для этого не требуется никакого приведения типов
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // Далее в классе GenDemo объявляется объект типа Gen<String>
        // Создать объект типа Gen для символьных строк
        Gen<String> sOb = new Gen<String>("текстовая строка");

        // показать тип данных, хранящихся в переменной sOb
        sOb.showType();

        // Получить значение переменной sOb.
        // И в этом случае приведение типов не требуется
        String str = sOb.getOb();
        System.out.println("Значение: " + str);
    }
}
