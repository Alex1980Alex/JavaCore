package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.A_РасширенияОператораSwitch.H_ЕщеОдинПримерВыраженияSwitch;
// Исполь зование выражения switch для выяснения, является ли символ
// гласной буквой в английском языке . Обратите внимание на применение
// блока в качестве цели оператора case со стрелкой для У.
public class Vowels {
    public static void main(String[] args) {
        // Если буква У должна считаться главной, тогда эту переменную
        // необходимо установить в true .
        boolean ylsVowel = true;
        char ch = 'Y' ;
        boolean isVcwel = switch (ch) {

        case 'а' , 'е', 'i' , 'о' , 'u' , 'А' , 'Е', 'I' , 'О' , 'U' -> true ;
        case 'Y' , 'y' -> { if ( ylsVowel) yield true ; else yield false; }
        default -> false;
        } ;
        if (isVcwel ) System.out.println (ch + " является гласной буквой . " ) ;
    }
}
