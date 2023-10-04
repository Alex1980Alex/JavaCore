package J_ВводВыводОператорTryСРесурсами.B_ЧтениеКонсольногоВвода.Example_Scanner;
import java.util.Scanner;

// Чтения консольного ввода с использованием класс Scanner
public class ConsoleInputExample {
        public static void main(String[] args) {
            // 1. создание объекта класса Scanner,
            // который используется для чтения ввода с клавиатуры (консольного ввода)
            // 2. System.in представляет стандартный входной поток, связанный с консолью,
            // и передается в качестве аргумента конструктору Scanner,
            // чтобы установить источник ввода.
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите ваше имя: ");
            // nextLine() используется для чтения строки
            String имя = scanner.nextLine();

            System.out.print("Введите ваш возраст: ");
            // nextInt() - для чтения целого числа
            int возраст = scanner.nextInt();

            System.out.println("Привет, " + имя + "! Ваш возраст - " + возраст + " лет.");

            // Не забудьте закрыть Scanner, когда он больше не нужен
            scanner.close();
        }
    }
// В этом примере Scanner используется для чтения строк и чисел из консоли.
// nextLine() используется для чтения строки, а nextInt() - для чтения целого числа.
// После использования Scanner его рекомендуется закрыть с помощью метода close(),
// чтобы освободить ресурсы.
