package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.C_Записи.A_ОсновыЗаписей;

public class RecordDemo {
    public static void main(String[] args) {
        // Создать массив записей Employee.
        Employee[] empList = new Employee[4] ;
        // Создать список сотрудников с использованием записи Employee.
        // Обратите внимание на способ конструирования каждой записи .
        // Аргументы автоматически присваиваются полям name и idNurn
        // в создаваемой записи.
        empList[0] = new Employee("Doe, John", 1047);
        empList[1] = new Employee(" Jones, Robert", 1048);
        empList[2] = new Employee("Smith, Rachel", 1049);
        empList[3] = new Employee("Martin, Dave", 1050);

        // Использовать методы доступа к содержимому записи
        // для отображения имен и идентификационных номеров.
        for(Employee e: empList) {
            System.out.println( "Идентификатором сотрудника " + e.name()
                    + " является " + e.idNum());
        }
    }
}
/*
Программа генерирует следующий вывод:
Идентификатором сотрудника Doe, John является 1047
Идентификатором сотрудника Jones, Robert является 1048
Идентификатором сотрудника Smith, Rachel является 1049
Идентификатором сотрудника Martin, Dave является 1050
 */
