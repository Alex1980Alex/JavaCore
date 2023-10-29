package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.D_СопоставлениеСОбразцомВОперацииInstanceof.C_СопоставлениеСОбразцомВДругихОператорах;


public class LoopExample {
    public static void main(String[] args) {
        Object[]  someObjs = {
        new String("One"),
        new String("Two"),
        new String("Three"),
        Integer.valueOf(10)
        };

        int i;
        for (i = 0; (someObjs [i] instanceof String str) && (i < someObjs.length) ; i++) {
            System.out.println("Oбpaбoткa " + str);
        }

    }
}
