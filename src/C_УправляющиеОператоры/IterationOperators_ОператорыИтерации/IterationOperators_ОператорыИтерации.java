package C_УправляющиеОператоры.IterationOperators_ОператорыИтерации;

public class IterationOperators_ОператорыИтерации {
    public static void main(String[] args) {
        // Оператор for:
        System.out.println("Оператор for:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Пример прохода по двумерному массиву:
        System.out.println("Пример прохода по двумерному массиву:");
        int[][] двумерныйМассив = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < двумерныйМассив.length; i++) {
            for (int j = 0; j < двумерныйМассив[i].length; j++) {
                System.out.print(двумерныйМассив[i][j] + " ");
            }
            System.out.println(); // Перейти на новую строку после завершения строки
        }

        // Цикл while:
        System.out.println("Цикл while:");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Цикл do-while:
        System.out.println("Цикл do-while:");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        // Цикл foreach (также известен как цикл for-each):
        System.out.println("Цикл foreach (также известен как цикл for-each):");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
