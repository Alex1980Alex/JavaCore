package K_Обобщения.K_ОбобщенныеКонструкторы.ИспользоватьОбобщенныйКонструктор;
//Использовать обобщенный конструктор
public class GenCons {
    private double val;

    <T extends Number> GenCons(T val) {
        this.val = val.doubleValue();
    }

    void showval() {
        System.out.println("val: " + this.val);
    }
}
// В конструкторе GenCons() задается параметр обобщенного типа,
// который может быть производным от класса Number, поэтому конструктор GenCons()
// можно вызывать с любым числовым типом, включая Integer, Float или Double.
