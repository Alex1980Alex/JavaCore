package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.C_Записи.A_ОсновыЗаписей;

public class Example {
    public static void main(String[] args) {
        Employee emp = new Employee ( "Doe, John", 1047);
        System.out.println ( "Идентификатором сотрудника " + emp.name()
                + " является " + emp.idNum() ) ;
    }
}
