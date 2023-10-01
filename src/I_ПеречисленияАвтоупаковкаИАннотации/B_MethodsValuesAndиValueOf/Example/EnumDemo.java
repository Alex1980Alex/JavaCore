package I_ПеречисленияАвтоупаковкаИАннотации.B_MethodsValuesAndиValueOf.Example;
// В программе демонстрируется применение методов values() и valueOf()
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы перечислимого типа Apple:");

        // создается переменная allapples, которой присваивается ссылка на массив значений перечислимого типа.
        Apple allapples[] = Apple.values();
        for (Apple a : allapples) {
            System.out.println(a);
        }

        System.out.println("\nКонстанты перечислимого типа Apple:");

        // цикл for можно написать и без переменной allapples
        for (Apple a : Apple.values() ) {
            System.out.print(a + " ");
        }

        System.out.println("\n");

        // метод valueOf() возвращает значение перечислимого типа, связанное с именем константы того же типа,
        // передаваемым этому методу в виде символьной строки.
        ap = Apple.valueOf("Winesap");
        System.out.println("Пepeмeннaя ар содержит " + ap);
    }
}
