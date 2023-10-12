package K_Обобщения.M_ИерархииОбобщенныхКлассов.ПримерОбобщенногоСуперклассаИПодклассаСоСвоимПараметром;

public class Gen2<T, V> extends Gen<T>  {
    V ob2;

    Gen2(T o, V o2) {
        super(o);
        this.ob2 = o2;
    }

    V getOb2() {
        return this.ob2;
    }
}
