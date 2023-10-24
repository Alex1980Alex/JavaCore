package L_ЛямбдаВыражения.K_СсылкиНаМетодыЭкземпляра.B_ПримерИспользованияСсылкиНаМетодЭкземпляраВместеСРазнымиОбъектами;
// Класс для хранения максимальной температуры за день
public class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        this.hTemp = ht;
    }
    // Метод возвращает логическое значение true,
    // если вызывающий объект типа HighTemp содержит
    // такую же температуру, как и у объекта ht2.
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // Метод возвращает логическое значение true,
    // если вызывающий объект типа HighTemp содержит
    // температуру ниже, чем у объекта ht2.
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
