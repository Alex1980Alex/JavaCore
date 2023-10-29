package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.C_Записи.B_ОбъявлениеКаноническогоКонструктора;

public record Worker(String name, int idNurn) {
    public Worker{
        name = name.trim();
    }
}
