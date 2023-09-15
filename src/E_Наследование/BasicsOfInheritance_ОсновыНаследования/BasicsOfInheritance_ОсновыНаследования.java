package E_Наследование.BasicsOfInheritance_ОсновыНаследования;

import E_Наследование.BasicsOfInheritance_ОсновыНаследования.Chapter.SubB;
import E_Наследование.BasicsOfInheritance_ОсновыНаследования.Chapter.SuperA;

public class BasicsOfInheritance_ОсновыНаследования {
    public static void main(String[] args) {
        SuperA superA = new SuperA();
        SubB subB = new SubB();

        superA.i = 10;
        superA.j = 20;
        System.out.println("Вызов метода из Суперкласса SuperA.");
        superA.showA();

        System.out.println("\nВызов методов из Подкласса SubB.");
        subB.i = 20;
        subB.j = 30;
        subB.k = 10;
        subB.showB();
        System.out.println(subB.sum());
        subB.showA();
        /* --------------------------
        Вызов из суперкласса SuperA.
        showA (i, j : 10, 20)

        Вызов из подкласса SubB.
        showB (k : 10)
        SubB.sum (i + j + k) = 60
        showA (i, j : 20, 30)
         */
    }

}
