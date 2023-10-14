package K_Обобщения.P_Приведение.ПриведениеВОбобщенныхМетодах;

public class Element<T> {
    T element;
    public Element(T o) {
        element = o;
    }
    public void printElementNotAnExplicitCast() {
        System.out.println(element);
    }

    public void printElementExplicitCasting() {
        if (element instanceof String) {
            String str = (String) element; // Явное приведение
            System.out.println("String: " + str);
        } else {
            System.out.println(element);
        }
    }
}
