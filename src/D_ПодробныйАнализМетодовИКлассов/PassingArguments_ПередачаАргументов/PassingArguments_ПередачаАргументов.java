package D_ПодробныйАнализМетодовИКлассов.PassingArguments_ПередачаАргументов;

public class PassingArguments_ПередачаАргументов {
    public static void main(String[] args) {
        // Передача аргументов по значению (Pass-by-Value):
        System.out.println("Передача аргументов по значению (Pass-by-Value):");
        int num = 5;
        modifyValue(num);
        System.out.println("After modifyValue: " + num);

        // Передача аргументов по ссылке (Pass-by-Reference):
        System.out.println("Передача аргументов по ссылке (Pass-by-Reference):");
        int[] myArray = { 1, 2, 3 };
        modifyArray(myArray);
        System.out.println("After modifyArray: " + myArray[0]);

        // Передача аргументов по значению ссылки (Pass-by-Value of Reference):
        System.out.println("Передача аргументов по значению ссылки (Pass-by-Value of Reference):");
        String greeting = "Hello";
        modifyString(greeting);
        System.out.println("After modifyString: " + greeting);

    }

    public static void modifyValue(int x) {
        x = x + 10;
        System.out.println("Inside modifyValue: " + x);
    }

    public static void modifyArray(int[] arr) {
        arr[0] = 100;
    }

    public static void modifyString(String s) {
        s = s + " World!";
    }
}
