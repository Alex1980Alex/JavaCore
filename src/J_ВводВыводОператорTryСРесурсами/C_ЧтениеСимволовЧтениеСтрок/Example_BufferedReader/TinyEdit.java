package J_ВводВыводОператорTryСРесурсами.C_ЧтениеСимволовЧтениеСтрок.Example_BufferedReader;
import java.io.*;
// Простейший текстовый редактор
public class TinyEdit {
    public static void main(String[] args) throws IOException {
        // - BufferedReader - это класс, который обеспечивает более эффективное чтение текстовых
        // данных из входных потоков, таких как клавиатура (стандартный ввод).
        // - InputStreamReader используется для преобразования байтового ввода (который предоставляет
        // System.in) в символьный ввод. Этот символьный ввод затем передается
        // BufferedReader для более удобного чтения текстовых данных.
        // - System.in представляет стандартный ввод, который обычно связан с клавиатурой.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Bвeдитe строки текста через <Enter>.");
        System.out.println("Bвeдитe 'стоп' для завершения:");
        for (int i = 0; i < 100; i++) {
            //  читает одну строку текста из входного потока и возвращает эту строку.
            str[i] = br.readLine();
            if (str[i].equals("стоп")) break;
        }
        System.out.println("\nCoдepжимoe вашего файла:");
        // вывести текстовые строки
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
/* ---------------------------------
Bвeдитe строки текста через <Enter>.
Bвeдитe 'стоп' для завершения:
**************
Первая строка.
Вторая строка.
1234567890
**************
стоп

Coдepжимoe вашего файла:
**************
Первая строка.
Вторая строка.
1234567890
**************
 */
