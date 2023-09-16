package E_Наследование.RedefiningMethods_ПереопределениеМетодов.Chapter_ПерегрузкаМетодов;

public class SubF extends SupE {
    int k;
    SubF(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // метод перегружает метод show() из Суперкласса supE
    void show(String msg) {
        System.out.println(msg + k);
    }
}
