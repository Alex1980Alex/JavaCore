package E_Наследование.RedefiningMethods_ПереопределениеМетодов.ChapterПереопределениеМетодов;

public class OverrideMethod {
    public static void main(String[] args) {
        F obF = new F(1,2,3);
        obF.show();
    }
}
/* --------------------------
Метод show() из Суперкласса E
Вывод переменных i, j : 1 , 2
Вывод переменной k : 3
 */
