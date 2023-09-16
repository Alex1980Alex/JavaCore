package E_Наследование.RedefiningMethods_ПереопределениеМетодов.Chapter_ПерегрузкаМетодов;

public class OverloadMethod {
    public static void main(String[] args) {
        SubF subOb = new SubF(1,2,3);

        System.out.println("Вызвать метод show() из Суперкласса SupE");
        subOb.show();

        subOb.show("Вызвать перегруженный метод show(), переменная k : ");
    }
}
/* -------------------------------------------------
Вызвать метод show() из Суперкласса SupE
Вывод переменных i, j : 1 , 2
Вызвать перегруженный метод show(), переменная k : 3
 */
