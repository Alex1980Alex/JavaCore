package D_ПодробныйАнализМетодовИКлассов.IntroductionToAccessControl_ВведениеВУправлениеДоступом.ДемонстрацияМодификаторовДоступа;

public class MySubClass extends MyBaseClass{
    public int protectedField;
    public MySubClass() {
    }

    public MySubClass(int protectedField) {
        super(protectedField);
    }

    // Этот подкласс имеет доступ к защищенным членам MyBaseClass
    public void someMethod() {
        this.protectedField = 42;
        protectedMethod();
    }
}
