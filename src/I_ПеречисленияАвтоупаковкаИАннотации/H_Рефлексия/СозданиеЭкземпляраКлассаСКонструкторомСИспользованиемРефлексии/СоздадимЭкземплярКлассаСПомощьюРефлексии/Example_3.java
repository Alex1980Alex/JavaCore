package I_ПеречисленияАвтоупаковкаИАннотации.H_Рефлексия.СозданиеЭкземпляраКлассаСКонструкторомСИспользованиемРефлексии.СоздадимЭкземплярКлассаСПомощьюРефлексии;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Этот способ создания объектов с использованием рефлексии позволяет создавать экземпляры классов
// с параметрами во время выполнения, когда типы и количество параметров неизвестны заранее.
public class Example_3 {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClass_3 myClass = null;
        try {
            // Этот код использует рефлексию для динамического создания экземпляра класса MyClass_3
            // - Class.forName(MyClass_3.class.getName()): Эта строка получает имя класса MyClass_3
            // с использованием MyClass_3.class.getName(), затем вызывает Class.forName(),
            // чтобы получить объект класса Class, представляющий класс MyClass_3.
            // - Class[] params = {int.class, String.class}:
            // Эта строка создает массив объектов класса Class, представляющих типы параметров,
            // которые ожидает конструктор класса MyClass_3. В данном случае, это int и String.
            // - clazz.getConstructor(params): Здесь мы используем объект класса clazz,
            // чтобы получить конструктор класса MyClass_3, который принимает параметры,
            // указанные в массиве params. Метод getConstructor() возвращает объект Constructor,
            // представляющий конструктор.
            // - newInstance(1, "default2"): Здесь мы вызываем конструктор, полученный в предыдущем шаге,
            // с аргументами 1 и "default2". Это создает новый объект, экземпляр класса MyClass_3,
            // используя указанные аргументы.
            // - myClass = (MyClass_3) ...: Созданный объект приводится к типу MyClass_3 и присваивается
            // переменной myClass. Теперь myClass содержит экземпляр класса MyClass_3,
            // который был создан динамически с использованием рефлексии и конструктора с параметрами.
            Class clazz = Class.forName(MyClass_3.class.getName());
            Class[] params = {int.class, String.class};
            myClass = (MyClass_3) clazz.getConstructor(params).newInstance(1, "default2");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        System.out.println(myClass);//output created object reflection.MyClass@60e53b93


        Class clazz = Class.forName(MyClass_3.class.getName());
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
    }
}
