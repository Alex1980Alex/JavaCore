package E_Наследование.ASuperclassTypeVariableCanReferToASubclassObject_ПеременнаяТипаСуперклассаМожетСсылатьсяНаОбъектПодкласса;

import E_Наследование.ASuperclassTypeVariableCanReferToASubclassObject_ПеременнаяТипаСуперклассаМожетСсылатьсяНаОбъектПодкласса.Chapter.Animal;
import E_Наследование.ASuperclassTypeVariableCanReferToASubclassObject_ПеременнаяТипаСуперклассаМожетСсылатьсяНаОбъектПодкласса.Chapter.Dog;

// Переменная типа суперкласса может ссылаться на объект подкласса
public class ASuperClassTypeVariableCanReferToASubclassObject {
    public static void main(String[] args) {
        // Переменная суперкласса ссылается на объект подкласса
        Animal myAnimal = new Dog();
        // Вызывает метод из класса Dog, если он переопределен
        myAnimal.makeSound();
    }
}
