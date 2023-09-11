package B_Операции.BitwiseOperations_ПобитовыеОперации;

public class BitwiseOperations_ПобитовыеОперации {
    public static void main(String[] args) {
        // Побитовое отрицание (~):
        System.out.println("Побитовое отрицание (~):");
        byte a = 0b00101010; // 42
        int result = ~a;     // инвертируем все биты
        String bin = String.format("%8s", Integer.toBinaryString(result))
                .replace(' ', '0');
        System.out.println(bin);
        System.out.println(result); // -42 (11010101)

        // Побитовое И (&):
        System.out.println("Побитовое И (&):");
        byte a_2 = 0b00101010; // 42
        byte b_2 = 0b00001111; // 15
        // выдает единичный бит, если биты в обоих операндах также
        // равны 1
        int result_2 = a_2 & b_2;
        String bin_2 = String.format("%8s", Integer.toBinaryString(result_2))
                .replace(' ', '0');
        System.out.println(bin_2);
        System.out.println(result_2); // 10 (00001010)

        // Побитовое ИЛИ (|):
        System.out.println("Побитовое ИЛИ (|):");
        byte a_3 = 0b00101010; // 42
        byte b_3 = 0b00001111; // 15
        // объединяет биты так, что если любой из битов в операндах равен 1,
        // то результирующий бит будет 1
        int result_3 = a_3 | b_3;
        String bin_3 = String.format("%8s", Integer.toBinaryString(result_3))
                .replace(' ', '0');
        System.out.println(bin_3);
        System.out.println(result_3); // 47 (00101111)

        // Побитовое исключающее ИЛИ (^):
        System.out.println("Побитовое исключающее ИЛИ (^):");
        byte a_4 = 0b00101010; // 42
        byte b_4 = 0b00001111; // 15
        // Результат будет содержать 1 в позициях,
        // где только один из операндов имеет 1, но не оба.
        int result_4 = a_4 ^ b_4;
        String bin_4 = String.format("%8s", Integer.toBinaryString(result_4))
                .replace(' ', '0');
        System.out.println(bin_4);
        System.out.println(result_4); // 37 (00100101)

        // Сдвиг влево (<<):
        System.out.println("Сдвиг влево (<<):");
        byte a_5 = 0b00000010; // 2
        // Эта операция сдвигает биты числа "a" влево на "n" позиций,
        // добавляя нули в освободившиеся позиции.
        // Это эквивалентно умножению числа "a" на 2 в степени "n".
        int n = 3;
        int result_5 = a_5 << n;
        String bin_5 = String.format("%8s", Integer.toBinaryString(result_5))
                .replace(' ', '0');
        System.out.println(bin_5);
        System.out.println(result_5); // (16) 00010000

        // Сдвиг вправо (>>):
        System.out.println("Сдвиг влево (>>):");
        byte a_6 = 0b00010000; // 16
        // Эта операция сдвигает биты числа "a" вправо на "n" позиций,
        // при этом заполняя освободившиеся позиции копиями старшего бита (знакового бита).
        // Если "a" положительное число, то слева добавляются нули,
        // если отрицательное, то единицы.
        int n_2 = 3;
        int result_6 = a_6 >> n_2;
        String bin_6 = String.format("%8s", Integer.toBinaryString(result_6))
                .replace(' ', '0');
        System.out.println(bin_6);
        System.out.println(result_6); // (2) 00000010

        // Сдвиг вправо с заполнением нулями (>>>):
        System.out.println("Сдвиг вправо с заполнением нулями (>>>):");
        byte a_7 = 0b00001111; // 15
        // Эта операция сдвигает биты числа "a" вправо на "n" позиций,
        // при этом заполняя освободившиеся позиции нулями. Всегда добавляются нули слева.
        int n_3 = 3;
        int result_7 = a_7 >>> n_3;
        String bin_7 = String.format("%8s", Integer.toBinaryString(result_7))
                .replace(' ', '0');
        System.out.println(bin_7);
        System.out.println(result_7); // (1) 00000001

        // Составные побитовые операции присваивания
        System.out.println("Составные побитовые операции присваивания");

        int c = 5; // 00000101
        int d = 3; // 00000011

        // Побитовое И и присвоение
        c &= d; // c становится равным 1 (поскольку 5 & 3 = 1)
        System.out.println(c);

        // Побитовое ИЛИ и присвоение
        c |= d; // c становится равным 3 (поскольку 1 | 3 = 3)
        System.out.println(c);

        // Побитовое исключающее ИЛИ и присвоение
        c = 5;
        c ^= d; // c становится равным 6 (поскольку 5 ^ 3 = 6)
        System.out.println(c);

        // Сдвиг влево и присвоение
        c <<= 2; // c становится равным 24 (поскольку 6 << 2 = 24)
        System.out.println(c);

        // Сдвиг вправо и присвоение
        c >>= 1; // c становится равным 12 (поскольку 24 >> 1 = 12)
        System.out.println(c);

        // Сдвиг вправо с заполнением нулями и присвоение
        c >>>= 1; // c становится равным 6 (поскольку 12 >>> 1 = 6)
        System.out.println(c);


    }
}
