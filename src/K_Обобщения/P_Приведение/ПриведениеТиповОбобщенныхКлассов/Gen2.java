package K_Обобщения.P_Приведение.ПриведениеТиповОбобщенныхКлассов;

// Подкласс, производный от класса Gen
public class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
    @Override
    T getOb() {
        System.out.println("Переопределен в классе Gen2");
        return ob;
    }
}
