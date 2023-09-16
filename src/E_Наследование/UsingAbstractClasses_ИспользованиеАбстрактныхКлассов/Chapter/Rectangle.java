package E_Наследование.UsingAbstractClasses_ИспользованиеАбстрактныхКлассов.Chapter;

public class Rectangle extends Figure{
    Rectangle(double a, double b) {
        super(a, b);
    }

    // Переопределяем метод area() для расчета площади и возврата четырехугольника
    double area() {
        System.out.print("Площадь четырехугольника : ");
        return side1 * side2;
    }
}
