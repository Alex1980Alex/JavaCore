package K_Обобщения.E_ОбобщенныйКлассСДвумяПараметрамиТипов.ПродемонстрироватьПрименениеКлассаТwoGen;
// Простой обобщенный класс с двумя параметрами типа: Т и V
public class TwoGen<T,V> {
    T ob1;
    V ob2;

    // передать конструктору ссылки на объекты типа T и V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // показать типы Т и V
    void showType() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

