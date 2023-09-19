package F_ПакетыИИнтерфейсы.VariablesInInterfaces_ПеременныеВИнтерфейсах.VariablesInInterfaces;

public class AskМe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позже");
                break;
            case SOON:
                System.out.println("Вскоре");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }
}
