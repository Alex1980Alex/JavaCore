package D_ПодробныйАнализМетодовИКлассов.ExploringTheStringClass_ИсследованиеКлассаString;

public class ExploringTheStringClass_ИсследованиеКлассаString {
    public static void main(String[] args) {
        // Создание строк:
        System.out.println("Создание строк:");
        // С использованием литералов:
        String str = "Пример текста";
        // С использованием конструктора:
        String str2 = new String("Пример текста");

        // Конкатенация (Concatenation):
        System.out.println("Конкатенация (Concatenation): ");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        // Длина строки:
        System.out.println("Длина строки:");
        String text = "Пример текста";
        int length = text.length(); // Вернет 12

        // Извлечение символов:
        System.out.println("Извлечение символов: ");
        char firstChar = text.charAt(0); // Вернет 'П'

        // Сравнение строк:
        System.out.println("Сравнение строк: ");
        String str3 = "Hello";
        String str4 = "hello";
        boolean isEqual = str3.equals(str4); // Вернет false
        boolean isEqualIgnoreCase = str3.equalsIgnoreCase(str4); // Вернет true

        // Поиск подстроки:
        System.out.println("Поиск подстроки: ");
        String text2 = "Это пример текста";
        int index = text2.indexOf("пример"); // Вернет 4

        // Замена подстроки:
        System.out.println("Замена подстроки: ");
        String text3 = "Привет, мир!";
        String newText = text3.replace("мир", "Java"); // Вернет "Привет, Java!"

        // Разделение строки:
        System.out.println("Разделение строки: ");
        String text4 = "apple,banana,grape";
        String[] fruits = text4.split(",");
        // fruits содержит {"apple", "banana", "grape"}

        // Преобразование к верхнему и нижнему регистру:
        System.out.println("Преобразование к верхнему и нижнему регистру: ");
        String text5 = "Привет, Мир!";
        String upperCaseText = text5.toUpperCase(); // Вернет "ПРИВЕТ, МИР!"
        String lowerCaseText = text5.toLowerCase(); // Вернет "привет, мир!"

    }
}
