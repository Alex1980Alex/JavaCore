package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.D_СопоставлениеСОбразцомВОперацииInstanceof.A_создаетсяПеременнаяТипаNurnЬerПоИмениMyOb;

public class Example {
    public static void main(String[] args) {
        // Integer.valueOf(9) создает объект типа Integer,
        // который оборачивает целочисленное значение 9. Такое оборачивание называется "boxing".
        Number myOb = Integer.valueOf(9);
        // Использование версии instanceof, поддерживающей сопоставление с образцом
        // Эта конструкция позволяет проверить, является ли myOb экземпляром класса Integer
        // (или его подклассов), и, если это так, создать переменную iObj, которая ссылается
        // на объект myOb. В противном случае, блок кода внутри if не выполняется.
        if (myOb instanceof Integer iObj) {
            // Здесь переменная iObj известна и находится в области видимости.
            System.out.println("iObj ссыпается на целое число: " + iObj);
        }
        // Здесь переменная iObj не существует.

        // Использование традиционной версии instanceof.
        if (myOb  instanceof Integer ) {
        // Использовать для получения iObj явное приведение.
            Integer iObj = (Integer) myOb ;
            System.out.println("iObj ссылается на целое число : " + iObj);
        }
    }
}
