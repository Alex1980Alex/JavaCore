package I_ПеречисленияАвтоупаковкаИАннотации.H_Рефлексия.ДобратьсяДоPrivateПоляNameКлассаMyClass;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null; //no getter =(
        System.out.println(number + name);//output 0null
        try {
            // - myClass.getClass(): Получает объект класса (Class) для объекта myClass.
            // Ваш myClass - это экземпляр класса, и метод getClass() возвращает класс этого объекта.
            // - .getDeclaredField("name"): Получает объект поля класса name с использованием рефлексии.
            // Метод getDeclaredField() позволяет получить доступ к полю даже если оно объявлено
            // как private или protected, так как вызван метод setAccessible(true),
            // который снимает ограничения доступа к полю.
            // - field.setAccessible(true): Этот вызов делает поле name доступным для чтения и записи,
            // даже если оно было объявлено как private.
            // Без этой строки код может выбросить исключение IllegalAccessException,
            // если поле не является доступным.
            // - name = (String) field.get(myClass): Этот код извлекает значение поля name из объекта
            // myClass с использованием рефлексии и приводит его к типу String.
            // Полученное значение присваивается переменной name.
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(myClass);
            // Этот код использует рефлексию для установки нового значения для поля name объекта myClass.
            // - field - это объект поля, который был получен с использованием рефлексиию.
            // myClass - это объект, у которого мы хотим изменить значение поля name.
            // (String) "new value" - это новое значение, которое мы хотим установить для поля.
            // - field.set(myClass, (String) "new value") выполняет установку нового значения для поля name
            // в объекте myClass. Это значение будет установлено независимо от модификаторов доступа
            // (private, protected, public) поля name.
            field.set(myClass, (String) "new value");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(number + name);//output 0default

        printData(myClass);
    }
    public static void printData(Object myClass){
        try {
            // Этот код использует рефлексию для получения объекта метода с именем "printData" из класса,
            // которому принадлежит объект myClass.
            // - myClass.getClass(): Этот вызов возвращает объект класса (Class) для объекта myClass.
            // То есть, это позволяет получить класс, к которому принадлежит myClass.
            // - .getDeclaredMethod("printData"): Этот вызов получает объект метода с именем "printData"
            // из класса, который был определен с использованием рефлексии.
            // Метод getDeclaredMethod() позволяет получить доступ к методу даже если он объявлен как
            // private, protected или имеет другой модификатор доступа.
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            // Таким образом, после выполнения этой строки кода, переменная method будет содержать объект
            // метода "printData", который можно будет использовать для вызова этого метода с помощью
            // рефлексии.
            method.invoke(myClass);
            // Обратите внимание, что для вызова метода с использованием invoke(), вам также может
            // потребоваться обработать исключения, которые могут возникнуть во время выполнения.
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
