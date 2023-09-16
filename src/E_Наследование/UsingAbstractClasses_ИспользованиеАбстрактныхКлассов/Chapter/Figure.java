package E_Наследование.UsingAbstractClasses_ИспользованиеАбстрактныхКлассов.Chapter;

abstract class Figure {
    double side1;
    double side2;

    Figure(double a, double b) {
        side1 = a;
        side2 = b;
    }

    // Теперь метод area() объявляется абстрактным и должен быть переопределен во всех подклассах
    abstract double area();
}
