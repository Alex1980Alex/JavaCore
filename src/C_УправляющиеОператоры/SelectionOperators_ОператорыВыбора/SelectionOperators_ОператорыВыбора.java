package C_УправляющиеОператоры.SelectionOperators_ОператорыВыбора;

public class SelectionOperators_ОператорыВыбора {
    public static void main(String[] args) {
        // Оператор if:
        System.out.println("Оператор if:");
        int age = 25;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы несовершеннолетний");
        }

        // Цenoчкa if-else-if java
        System.out.println("Цenoчкa if-else-if java");
        int number = 5;

        if (number > 10) {
            System.out.println("Число больше 10");
        } else if (number > 5) {
            System.out.println("Число больше 5, но не больше 10");
        } else if (number > 0) {
            System.out.println("Число больше 0, но не больше 5");
        } else {
            System.out.println("Число меньше или равно 0");
        }


        //Оператор switch:
        System.out.println("Оператор switch:");
        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            // и так далее...
            default:
                System.out.println("День недели неизвестен");
        }

        // Вложенные операторы swi tch
        System.out.println("Вложенные операторы swi tch");
        int x = 1;
        int y = 2;

        switch (x) {
            case 1:
                switch (y) {
                    case 1:
                        System.out.println("x и y равны 1");
                        break;
                    case 2:
                        System.out.println("x равно 1, y равно 2");
                        break;
                    default:
                        System.out.println("Внутренний switch: y неизвестное значение");
                }
                break;
            case 2:
                System.out.println("x равно 2");
                break;
            default:
                System.out.println("Внешний switch: x неизвестное значение");
        }

        // NEW
        System.out.println("Оператор switch NEW:");
        switch (dayOfWeek) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            default -> System.out.println("День недели неизвестен");
        }

        // Тернарный оператор (оператор условия):
        System.out.println("Тернарный оператор (оператор условия):");
        int c = 10;
        String result = (c > 5) ? "c больше 5" : "c меньше или равен 5";
        System.out.println(result);

    }
}
