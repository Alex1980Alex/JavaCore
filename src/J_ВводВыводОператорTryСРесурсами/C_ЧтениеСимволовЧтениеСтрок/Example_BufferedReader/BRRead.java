package J_ВводВыводОператорTryСРесурсами.C_ЧтениеСимволовЧтениеСтрок.Example_BufferedReader;
import java.io.*;
// Использовать класс BufferedReader для чтения символов с консоли
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;

        // - BufferedReader - это класс, который обеспечивает более эффективное чтение текстовых
        // данных из входных потоков, таких как клавиатура (стандартный ввод).
        // - InputStreamReader используется для преобразования байтового ввода (который предоставляет
        // System.in) в символьный ввод. Этот символьный ввод затем передается
        // BufferedReader для более удобного чтения текстовых данных.
        // - System.in представляет стандартный ввод, который обычно связан с клавиатурой.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bвeдитe символы, 'q' - для выхода."); // читать символы

        try {
        do {
            c = (char) br.read(); // Чтение строки с клавиатуры
            System.out.println(c);
        } while (c != 'q');
        br.close(); // Закрытие BufferedReader
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* -------------------------------
    Введите символы, 'q' - для выхода.
        123abcq
        1
        2
        3
        а
        ь
        с
        q
        */
