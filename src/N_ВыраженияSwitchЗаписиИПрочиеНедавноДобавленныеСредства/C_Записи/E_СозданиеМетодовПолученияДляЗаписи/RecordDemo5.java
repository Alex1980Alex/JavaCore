package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.C_Записи.E_СозданиеМетодовПолученияДляЗаписи;

public class RecordDemo5 {
    public static void main(String[] args) {
        Employee emp = new Employee("Jones , Robert", 1048);
        // Отобразить немодифицированный компонент name.
        System.out.println ( "Имя и фамилия сотрудника : " + emp.name() ) ;
        // Отобразить только фамилию.
        System.out.println("Фaмилия сотрудника : "+ emp.lastName());
    }
}
