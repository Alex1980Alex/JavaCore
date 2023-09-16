package E_Наследование.RedefiningMethods_ПереопределениеМетодов.Chapter_ПерегрузкаМетодов;

public class SupE {
    int i, j;
    SupE (int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("Вывод переменных i, j : " + i + " , " + j);
    }
}
