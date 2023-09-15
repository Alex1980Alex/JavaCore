package E_Наследование.MemberAccessAndInheritance_ДоступКЧленамИНаследование.Chapter;

public class Dog extends Animal{
    public void accessFieldsAndMethods() {
        System.out.println(publicField);    // ОК, publicField унаследован и public
        System.out.println(protectedField); // ОК, protectedField унаследован и protected
        System.out.println(defaultField);   // ОК, defaultField унаследован и default
        // System.out.println(privateField); // Ошибка компиляции, privateField не унаследован
        publicMethod();                     // ОК, publicMethod унаследован и public
        protectedMethod();                 // ОК, protectedMethod унаследован и protected
        defaultMethod();                   // ОК, defaultMethod унаследован и default
        // privateMethod();                 // Ошибка компиляции, privateMethod не унаследован
    }
}
