package E_Наследование.RedefiningMethods_ПереопределениеМетодов.ChapterПереопределениеМетодов;

public class F extends E{
    int k;
    F(int a, int b, int c){
        super(a, b);
        k = c;
    }
    // метод переопределяет метод show() из Суперкласса E
    void show() {
        System.out.println("Метод show() из Суперкласса E");
        super.show();
        System.out.println("Вывод переменной k : " + k);
    }
}
