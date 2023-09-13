package D_ПодробныйАнализМетодовИКлассов.MethodOverloading_ПерегрузкаМетодов;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }
}
