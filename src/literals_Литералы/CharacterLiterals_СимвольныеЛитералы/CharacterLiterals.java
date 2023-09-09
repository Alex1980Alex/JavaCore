package literals_Литералы.CharacterLiterals_СимвольныеЛитералы;

public class CharacterLiterals {
    public static void main(String[] args) {
        //одиночным символом,
        char letter = 'A';
        System.out.println(letter);

        //символом управления (например, перевода строки),
        char newline = '\n';
        System.out.println(newline);

        //символом Unicode или символом escape-последовательности.
        char euroSymbol = '\u20AC'; // €
        System.out.println(euroSymbol);
    }
}
