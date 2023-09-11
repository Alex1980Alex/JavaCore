package B_Операции.BitwiseOperations_ПобитовыеОперации;

public class BinarySystem_ДвоичнаяСистема {
    public static void main(String[] args) {
        // значение указывать в виде битов
        System.out.println("значение указывать в виде битов");
        byte data = 0b101;
        System.out.println(data);

        // переменную типа байт представить в двоичном виде в виде строки
        System.out.println("переменную типа байт представить в двоичном виде в виде строки");
        byte octet = 5;
        String bin = String.format("%8s", Integer.toBinaryString(octet))
                .replace(' ', '0');
        System.out.println(bin);
    }
}
