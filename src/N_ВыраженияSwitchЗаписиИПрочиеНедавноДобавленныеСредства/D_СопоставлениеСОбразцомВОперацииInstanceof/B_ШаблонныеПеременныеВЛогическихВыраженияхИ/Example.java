package N_ВыраженияSwitchЗаписиИПрочиеНедавноДобавленныеСредства.D_СопоставлениеСОбразцомВОперацииInstanceof.B_ШаблонныеПеременныеВЛогическихВыраженияхИ;

public class Example<T> {
    private T data;

    public Example(T data) {
        this.data = data;
    }

    public boolean isDataValid() {
        // Логическое выражение с использованием шаблонной переменной
        return data != null && data instanceof String;
    }

    public static void main(String[] args) {
        Example<String> stringExample = new Example<>("Hello, world!");
        Example<Integer> integerExample = new Example<>(42);

        System.out.println("Is data in stringExample valid? " + stringExample.isDataValid());
        System.out.println("Is data in integerExample valid? " + integerExample.isDataValid());
    }

}
/*
В этом примере Example - это обобщенный класс с шаблонной переменной T.
Метод isDataValid использует оператор "&&" для проверки, что data не равно null
и что data является экземпляром класса String. Вы можете использовать шаблонные
переменные для обобщения кода и сделать его более универсальным.
 */
