package K_Обобщения.S_Стирание.Example;

public class Demo {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(10);
        myList.set(1, "Hello world");
        System.out.println(myList.get(1));
    }
}
