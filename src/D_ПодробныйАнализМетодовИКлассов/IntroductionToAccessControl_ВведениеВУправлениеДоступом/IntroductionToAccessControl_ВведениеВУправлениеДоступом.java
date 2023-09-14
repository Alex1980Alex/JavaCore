package D_ПодробныйАнализМетодовИКлассов.IntroductionToAccessControl_ВведениеВУправлениеДоступом;

import D_ПодробныйАнализМетодовИКлассов.IntroductionToAccessControl_ВведениеВУправлениеДоступом.ДемонстрацияМодификаторовДоступа.OtherClass;

public class IntroductionToAccessControl_ВведениеВУправлениеДоступом {
    public static void main(String[] args) {
        // Создать объект из другого пакета и вызвать его метод java
        System.out.println("\n" +
                "Создать объект из другого пакета и вызвать его метод java");
        OtherClass otherObj = new OtherClass();
        otherObj.setc(10);
        System.out.println(otherObj.getc());
    }

}
