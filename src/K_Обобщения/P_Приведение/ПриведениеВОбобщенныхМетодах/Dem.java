package K_Обобщения.P_Приведение.ПриведениеВОбобщенныхМетодах;

public class Dem {
    public static void main(String[] args) {

        Element<Integer> element_1 = new Element<Integer>(88);
        element_1.printElementExplicitCasting();
        element_1.printElementNotAnExplicitCast();

        Element<String> element_2 = new Element<String>("Hello world");
        element_2.printElementExplicitCasting();
        element_2.printElementNotAnExplicitCast();
    }
}
