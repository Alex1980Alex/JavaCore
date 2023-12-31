package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.C_Записи.C_ОбъявлениеНеканоническогоКонструктора;

public record Employee(String name, int idNurn) {
    // Использовать статическое поле в записи.
    static int pendingID = -1;
    // Использовать компактный канонический конструктор для удаления
    // любых ведущих и завершающих пробелов из строки имени .
    public Employee {
        name = name.trim();
    }
    // Это неканонический конструктор . Обратите внимание ,
    // что для создания записи он передает каноническому конструктору
    // не идентификационный номер , а pendingID.
    public Employee(String name) {
        this(name, pendingID);
    }
}
