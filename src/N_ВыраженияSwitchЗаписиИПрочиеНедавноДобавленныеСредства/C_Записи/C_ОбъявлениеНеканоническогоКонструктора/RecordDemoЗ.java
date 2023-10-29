package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.C_Записи.C_ОбъявлениеНеканоническогоКонструктора;

public class RecordDemoЗ {
    public static void main(String[] args) {
        Employee [] empList = new Employee [4] ;
        // Создать  список сотрудников с использованием записи Employee .
        empList [0] = new Employee ("Doe , John ", 1047 ) ;
        empList [1] = new Employee ("Jones, Robert", 1048) ;
        empList [2] = new Employee ( "Smith, Rachel", 1049 ) ;
        // Ожидающий идентификационный номер .
        empList [3] = new Employee ( "Martin, Dave" );
        // Отобразить имена и идентификационные номера .
        for (Employee e: empList) {
            System.out.print("Идентификатором сотрудника " + e.name()
                    + " является ");
            if (e.idNurn() == Employee.pendingID) System.out.println("oжидaющий");
            else System.out.println(e.idNurn());
        }

        }
}
