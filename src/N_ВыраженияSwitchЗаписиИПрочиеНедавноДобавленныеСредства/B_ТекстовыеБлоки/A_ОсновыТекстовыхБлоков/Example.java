package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.B_ТекстовыеБлоки.A_ОсновыТекстовыхБлоков;

public class Example {
    public static void main(String[] args) {
        String textBlock = """
    Это текстовый блок.
    Он может содержать
    несколько строк.
    """;
        System.out.println(textBlock);

        String str = """
                А
                    в
                с
         """; // определяет начало отступа
        String str2 = """
                А
                    в
                с
                """; // никакого влияния не оказывает

        String strЗ = """
                А
                   в
                с
              """; // приводит к удалению пробельных символов вплоть до """

        System.out.print(str);
        System.out.print(str2);
        System.out. print(strЗ);
    }
}
