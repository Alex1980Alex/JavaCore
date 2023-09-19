package F_ПакетыИИнтерфейсы.DemonstratingTheUseOfAccessModifiers_ДемонстрацияИспользованияМодификаторовДоступа.pkg02;

import F_ПакетыИИнтерфейсы.DemonstratingTheUseOfAccessModifiers_ДемонстрацияИспользованияМодификаторовДоступа.Chapter.pkg01.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection pkgObject02 = new Protection();
        System.out.println("Конструктор из другого пакета pkg02");

        //ОШИБКА!!! доступно только для данного класса Protection или пакета pkg01
        //System.out.println("n = " + pkgObject02.n);
        //ОШИБКА!!! доступно только для данного класса Protection
        //System.out.println("n_priv = " + pkgObject02.npriv);
        //ОШИБКА!!! доступно только для данного класса Protection, подкласса Derived или пакета pkg01
        //System.out.println("n_priv = " + pkgObject02.npriv);

        System.out.println("n_publ = " + pkgObject02.n_publ);

    }
}
