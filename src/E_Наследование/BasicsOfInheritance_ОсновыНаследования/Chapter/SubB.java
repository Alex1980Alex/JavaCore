package E_Наследование.BasicsOfInheritance_ОсновыНаследования.Chapter;
// Создать подкласс путем расширения класса A
public class SubB extends SuperA{
    public int k;

    public void showB () {
        System.out.println("showB (k : " + k + ")");
    }

    public int sum() {
        System.out.print("SubB.sum (i + j + k) = ");
        return i + j + k;
    }
}
