package E_Наследование.ASuperclassTypeVariableCanReferToASubclassObject_ПеременнаяТипаСуперклассаМожетСсылатьсяНаОбъектПодкласса.Chapter;

public class Dog extends Animal  {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
