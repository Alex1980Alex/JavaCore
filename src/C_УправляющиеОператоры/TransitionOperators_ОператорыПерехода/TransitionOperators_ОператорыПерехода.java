package C_УправляющиеОператоры.TransitionOperators_ОператорыПерехода;

public class TransitionOperators_ОператорыПерехода {
    public static void main(String[] args) {
        // break используется для выхода из цикла
        System.out.println("break используется для выхода из цикла");
        for (int y = 0; y < 10; y++) {
            if (y == 5) {
                break; // Выход из цикла при y == 5
            }
            System.out.println(y);
        }

        // break с меткой
        System.out.println("break с меткой");
        outerLoop:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Выходим из внешнего цикла");
                    break outerLoop; // Выход из внешнего цикла
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        // continue используется для перехода к следующей итерации цикла,
        // игнорируя оставшееся тело цикла для текущей итерации
        System.out.println("continue");
        for (int p = 0; p < 5; p++) {
            if (p == 2) {
                continue; // Пропустить итерацию при p == 2
            }
            System.out.println(p);
        }
        // return:
        System.out.println("return:");
        System.out.println(add(2, 4));

        // throw:
        System.out.println("throw:");
        boolean someCondition = true;
        if (someCondition) {
            try {
                throw new SomeException("Сообщение об ошибке");
            } catch (SomeException e) {
                throw new RuntimeException(e);
            }
        }

    }
    // return:
    public static int add(int a, int b) {
        return a + b;
    }
}
