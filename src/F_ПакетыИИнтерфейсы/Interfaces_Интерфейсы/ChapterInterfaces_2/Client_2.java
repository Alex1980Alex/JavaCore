package F_ПакетыИИнтерфейсы.Interfaces_Интерфейсы.ChapterInterfaces_2;

import F_ПакетыИИнтерфейсы.Interfaces_Интерфейсы.ChapterInterfaces.Callback;

public class Client_2 implements Callback {
    // реализовать интерфейс Callback обязательно с модификатором доступа public !!!
    public void callback (int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате = " + (p * p));
    }
}
