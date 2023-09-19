package F_ПакетыИИнтерфейсы.DemonstratingTheUseOfAccessModifiers_ДемонстрацияИспользованияМодификаторовДоступа.pkg02;

import F_ПакетыИИнтерфейсы.DemonstratingTheUseOfAccessModifiers_ДемонстрацияИспользованияМодификаторовДоступа.Chapter.pkg01.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("Конструктор, унаследованный из другого пакета");

        //ОШИБКА!!! доступно только для данного класса Protection или пакета pkg01
        //System.out.println("n = " + n);
        //ОШИБКА!!! доступно только для данного класса Protection
        //System.out.println("n_priv = " + npriv);

        System.out.println("n_prot = " + n_prot);
        System.out.println("n_publ = " + n_publ);
    }
}
