package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.C_Записи.B_ОбъявлениеКаноническогоКонструктора;

public class Example {
    public static void main(String[] args) {
        Employee employee = new Employee(" Alex", 1032);
        System.out.println(employee.name() + ", " + employee.idNurn());

        Worker worker = new Worker("Poll ", 3412);
        System.out.println(worker.name() + ", " + worker.idNurn());

    }
}
