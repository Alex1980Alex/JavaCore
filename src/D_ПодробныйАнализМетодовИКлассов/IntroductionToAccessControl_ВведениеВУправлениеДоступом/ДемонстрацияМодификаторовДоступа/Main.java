package D_ПодробныйАнализМетодовИКлассов.IntroductionToAccessControl_ВведениеВУправлениеДоступом.ДемонстрацияМодификаторовДоступа;

public class Main {
    public static void main(String[] args) {
        MySubClass Sub = new MySubClass(5);
        Sub.protectedMethod();
        Sub.someMethod();
        Sub.protectedMethod();
    }
}
