package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.A_РасширенияОператораSwitch.E_ИспользованиеБлоковВОператорахCaseСоСтрелками;
// Использование блоков в операторах case со стрелками.
public class BlockArrowCase {
    public static void main(String[] args) {
        boolean stopNow ;
        int eventCode = 9300;
        // Использовать блоки в операторах case со стрелками. Снова
        // обратите внимание , что для предотвращения сквозного выполнения
        // оператор break не нужен ( да и не разрешен) .
        // Поскольку целью -> является блок, для предоставления значения
        // должен применяться оператор yield.
        int priorityLevel = switch(eventCode) {
            case 1000, 1205, 8900 -> { // использовать блок
                stopNow = false;
                System.out.println("Tpeвoгa");
                yield 1;
            }
            case 2000, 6010, 9128 -> {
                stopNow = false;
                System.out.println("Пpeдyпpeждeниe");
                yield 2;
            }
            case 1002, 7023, 9300 -> {
                stopNow = true;
                System.out.println("Oпacнocт ь ");
                yield 3;
            }
            default -> {
                stopNow = false;
                System.out.println("Bce нормально");
                yield 0;
            }
        };
        System.out.println( "Ypoвeнь приоритета для кода события "
                + eventCode + " равен " + priorityLevel) ;
        if(stopNow) System.out.println(" Tpeбyeтcя останов. ");
    }
}
