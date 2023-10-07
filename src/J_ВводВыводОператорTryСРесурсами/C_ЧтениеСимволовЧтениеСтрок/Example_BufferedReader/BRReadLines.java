package J_ВводВыводОператорTryСРесурсами.C_ЧтениеСимволовЧтениеСтрок.Example_BufferedReader;
import java.io.*;
// Чтение символьных строк с консоли средствами класса BufferedReader
public class BRReadLines {
    public static void main(String[] args) throws IOException {

        // - BufferedReader - это класс, который обеспечивает более эффективное чтение текстовых
        // данных из входных потоков, таких как клавиатура (стандартный ввод).
        // - InputStreamReader используется для преобразования байтового ввода (который предоставляет
        // System.in) в символьный ввод. Этот символьный ввод затем передается
        // BufferedReader для более удобного чтения текстовых данных.
        // - System.in представляет стандартный ввод, который обычно связан с клавиатурой.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Bвeдитe строки текста через <Enter>.");
        System.out.println("Bвeдитe 'стоп' для завершения:");
        try {
        do {
            //  читает одну строку текста из входного потока и возвращает эту строку.
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("стоп"));
            br.close(); // Закрытие BufferedReader
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* ---------------------------
Bвeдитe строки текста через <Enter>.
Bвeдитe 'стоп' для завершения:
1234 abc
стоп
 */
