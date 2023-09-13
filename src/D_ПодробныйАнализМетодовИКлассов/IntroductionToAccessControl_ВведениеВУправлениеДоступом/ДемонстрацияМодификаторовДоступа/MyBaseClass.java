package D_ПодробныйАнализМетодовИКлассов.IntroductionToAccessControl_ВведениеВУправлениеДоступом.ДемонстрацияМодификаторовДоступа;

public class MyBaseClass {
    protected int protectedField;
    public MyBaseClass() {
        this.protectedField = 0;
    }
    public MyBaseClass(int protectedField) {
        this.protectedField = protectedField;
    }
    protected void protectedMethod() {
        System.out.println("protectedField:" + protectedField);
    }
}
