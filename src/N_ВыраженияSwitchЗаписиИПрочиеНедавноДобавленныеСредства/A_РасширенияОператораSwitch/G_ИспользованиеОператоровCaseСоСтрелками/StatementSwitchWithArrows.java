package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.A_РасширенияОператораSwitch.G_ИспользованиеОператоровCaseСоСтрелками;

public class StatementSwitchWithArrows {
    public static void main(String[] args) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        char direction = 'R';
        // Использовать операторы case со стрелками в операторе switch .
        // Обратите внимание, что значение не производится .
        switch (direction) {
            case 'L' -> {
                System.out.println("Пoвepнyть налево");
                left++;
            }
            case 'R' -> {
                System.out.println(" Пoвepнyть напра во ");
                right++;
            }
            case 'U' -> {
                System.out.println("Двигaтьcя вверх ");
                up++;
            }
            case 'D' -> {
                System.out.println("Двигаться вниз ");
                down++;
            }
        }
        System.out.println(right);
    }
}
