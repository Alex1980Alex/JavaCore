package K_Обобщения.S_Стирание.Example;

public class MyList<T> {
    private T[] array;

    public MyList(int size) {
        array = (T[]) new Object[size]; // Стирание типа
    }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T value) {
        array[index] = value;
    }
}
