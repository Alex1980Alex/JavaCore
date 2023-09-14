package D_ПодробныйАнализМетодовИКлассов.NestedAndInternalClasses_ВложенныеИВнутренниеКлассы;

public class OuterClass {
    // Внешний класс

    static class StaticNestedClass {
        // Статический вложенный класс
        private int a;
        public StaticNestedClass() {
            this.a = 0;
        }

        public StaticNestedClass(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }
}
