package L_ЛямбдаВыражения.M_СсылкиНаКонструкторы.A_ПримерПримененияСсылкиСсылкиНаКонструктор;

public class MyClass {
    private int val;

    // Конструктор с одним аргументом
    MyClass(int val) {
        this.val = val;
    }

    // Конструктор по умолчанию
    MyClass() {
        this.val = 0;
    }

    int getVal() {
        return this.val;
    }
}
