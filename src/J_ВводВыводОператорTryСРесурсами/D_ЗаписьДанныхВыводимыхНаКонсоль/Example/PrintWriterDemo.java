package J_ВводВыводОператорTryСРесурсами.D_ЗаписьДанныхВыводимыхНаКонсоль.Example;
import java.io.*;
// Продемонстрировать применение класса PrintWriter
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Это строка");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);

    }
}
/* -------
Это строка
-7
4.5E-7
 */
