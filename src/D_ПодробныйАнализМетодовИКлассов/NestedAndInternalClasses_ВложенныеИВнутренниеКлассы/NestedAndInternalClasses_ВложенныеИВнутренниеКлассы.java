package D_ПодробныйАнализМетодовИКлассов.NestedAndInternalClasses_ВложенныеИВнутренниеКлассы;

public class NestedAndInternalClasses_ВложенныеИВнутренниеКлассы {
    public static void main(String[] args) {
        // Статические вложенные классы (Static Nested Classes)
        System.out.println("Статические вложенные классы (Static Nested Classes)");
        OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
        nestedObj.setA(10);
        System.out.println(nestedObj.getA());

    }
}
