package L_ЛямбдаВыражения.E_БлочныеЛямбдаВыражения.B_РазвернутьСтрокуВОбратномПорядкеИспользуяЛямбдаВыражение;

public class StringReversalLambda {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Строка в обратном порядке : " + reverse.getReversal("Строка"));
    }
}
/* -------------------------------
Строка в обратном порядке : акортС
 */
