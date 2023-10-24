package L_ЛямбдаВыражения.H_ЛямбдаВыраженияИИсключения.СгенерироватьИсключениеИзЛямбдаВыражения;

public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Пустой массив");
    }
}
