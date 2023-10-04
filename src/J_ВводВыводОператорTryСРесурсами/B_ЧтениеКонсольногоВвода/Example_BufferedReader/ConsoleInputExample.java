package J_ВводВыводОператорTryСРесурсами.B_ЧтениеКонсольногоВвода.Example_BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// BufferedReader используется для чтения строк из консоли.
// Когда вы создаете объект BufferedReader с new BufferedReader(new InputStreamReader(System.in)),
// вы получаете готовый инструмент для чтения строк, введенных пользователем с клавиатуры.
// Вы можете использовать методы readLine() этого объекта для чтения строк из консоли.
public class ConsoleInputExample {
    public static void main(String[] args) {
        // 1. BufferedReader - это буферизированный символьный поток ввода.
        // Он используется для эффективного считывания данных из InputStreamReader.
        // Буферизация помогает снизить количество операций ввода-вывода, что может улучшить производительность.
        // 2. InputStreamReader - это обертка, которая преобразует байты из System.in в символы.
        // Таким образом, она выполняет преобразование между потоками байтов и потоками символов.
        // 3. System.in - это объект класса InputStream, который представляет стандартный входной поток,
        // связанный с консолью. Этот поток предоставляет байты, введенные пользователем с клавиатуры.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Введите ваше имя: ");
            // методы readLine() для чтения строк из консоли.
            String имя = reader.readLine();

            System.out.print("Введите ваш возраст: ");
            // методы readLine() для чтения строк из консоли.
            int возраст = Integer.parseInt(reader.readLine());

            System.out.println("Привет, " + имя + "! Ваш возраст - " + возраст + " лет.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
