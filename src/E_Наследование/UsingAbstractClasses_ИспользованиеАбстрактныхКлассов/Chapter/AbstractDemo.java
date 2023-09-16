package E_Наследование.UsingAbstractClasses_ИспользованиеАбстрактныхКлассов.Chapter;

public class AbstractDemo {
    public static void main(String[] args) {
        Rectangle obR = new Rectangle(2, 3);
        Triangle  obT = new Triangle(2, 3);

        // Переменная ref объявлена как ссылка на класс Figure,
        // т.е. ее можно использовать для ссылки на объект любого подкласса
        Figure ref;

        // Присваиваем ссылке объект четырехугольника
        ref = obR;
        System.out.println(ref.area());

        // Присваиваем ссылке объект треугольника
        ref = obT;
        System.out.println(ref.area());
    }
}
/* ---------------------------
Площадь четырехугольника : 6.0
Площадь треугольника : 3.0
 */
