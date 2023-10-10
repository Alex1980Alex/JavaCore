package K_Обобщения.D_КакимОбразомОбобщенияПовышаютТиповуюБезопасность.ПродемонстрироватьНеобобщенныйКласс;
// Класс NonGen - функциональный эквивалент класса Gen без обобщений
public class NonGen {
    Object ob; //объект оb теперь имеет тип Object

    // передать конструктору ссылку на объект типа Object
    NonGen(Object o) {
        ob = o;
    }

    // возвратить тип Object
    Object getOb() {
        return ob;
    }

    // показать тип объекта оb
    void showType() {
        System.out.println("Oбъeкт оb относится к типу: " + ob.getClass().getName());
    }
}
