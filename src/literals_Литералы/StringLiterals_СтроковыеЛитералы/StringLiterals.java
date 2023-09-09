package literals_Литералы.StringLiterals_СтроковыеЛитералы;

public class StringLiterals {
    public static void main(String[] args) {
        //Одиночная строка:
        System.out.println("Одиночная строка");
        String singleString = "Это одиночная строка.";
        System.out.println(singleString);

        //Пустая строка:
        System.out.println("Пустая строка");
        String emptyString = "";
        System.out.println(emptyString);

        //Строка с escape-последовательностями:
        System.out.println("Строка с escape-последовательностями");
        String stringWithEscape = "Это строка с символом новой строки:\nи табуляцией:\tи символами \"кавычек\".";
        System.out.println(stringWithEscape);

        //Строка с символами Unicode:
        System.out.println("Строка с символами Unicode");
        String unicodeString = "Символ евро: \u20AC";
        System.out.println(unicodeString);

        //Строка с переводами строк (многострочная строка):
        System.out.println("Строка с переводами строк (многострочная строка)");
        String multiLineString = "Это\nмногострочная\nстрока.";
        System.out.println(multiLineString);
    }
}
