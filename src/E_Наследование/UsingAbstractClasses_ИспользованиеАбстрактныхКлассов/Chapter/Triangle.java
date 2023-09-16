package E_Наследование.UsingAbstractClasses_ИспользованиеАбстрактныхКлассов.Chapter;

public class Triangle extends Figure{
    Triangle(double a, double b) {
    super(a, b);
}

    // Переопределяем метод area() для расчета площади и возврата треугольника
    double area() {
        System.out.print("Площадь треугольника : ");
        return side1 * side2 / 2;
    }

}
