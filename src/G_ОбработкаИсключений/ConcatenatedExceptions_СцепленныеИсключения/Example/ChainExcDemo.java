package G_ОбработкаИсключений.ConcatenatedExceptions_СцепленныеИсключения.Example;

public class ChainExcDemo {
    static void demoproc() {
// Создать исключение.
        NullPointerException e =
                new NullPointerException("вepxний уровень");
// Добавить причину.
        e.initCause(new ArithmeticException("пpичинa"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
// Отобразить исключение верхнего уровня.
            System.out.println("Пepexвaчeнo : " + e);
// Отобразить исключение-причину.
            System.out.println("Пepвoнaчaльнaя причина : " + e.getCause());
        }
    }
}