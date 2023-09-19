package F_ПакетыИИнтерфейсы.Interfaces_Интерфейсы.ChapterInterfaces_2;

import F_ПакетыИИнтерфейсы.Interfaces_Интерфейсы.ChapterInterfaces.Callback;
import F_ПакетыИИнтерфейсы.Interfaces_Интерфейсы.ChapterInterfaces.Client;

// Пример программы демонстрирует полиморфные возможности
public class TestIfac {
    public static void main(String[] args) {
        Callback c = new Client();
        Client_2 ob = new Client_2();

        c.callback(42);

        c = ob; // теперь переменная c ссылается на объект ob типа Client2
        c.callback(3);

    }
}
