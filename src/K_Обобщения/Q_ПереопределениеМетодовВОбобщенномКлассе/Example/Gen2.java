package K_Обобщения.Q_ПереопределениеМетодовВОбобщенномКлассе.Example;

public class Gen2<T> extends Gen<T>  {
    Gen2(T o) {
        super(o);
    }

    // переопределить метод getOb()
    T getOb() {
        System.out.print("Meтoд getOb() из класса Gen2: ");
        return ob;
    }
}
