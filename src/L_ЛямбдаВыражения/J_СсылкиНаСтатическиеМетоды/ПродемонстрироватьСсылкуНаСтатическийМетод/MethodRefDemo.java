package L_ЛямбдаВыражения.J_СсылкиНаСтатическиеМетоды.ПродемонстрироватьСсылкуНаСтатическийМетод;

public class MethodRefDemo {
    // В этом методе функциональный интерфейс
    // указывается в качестве типа первого его параметра.
    // Следовательно, ему может быть передан любой экземпляр
    // данного интерфейса, включая и ссылку на метод.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Это исходная строка";
        String outStr;

        /*
        StringFunc sf = MyStringOps::strReverse;
        // Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(sf , inStr);
         */
        // Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse , inStr);

        System.out.println(inStr + " : обращенная строка будет : " + outStr);
    }
}
/*
Особое внимание в следующей строке кода:

    outStr = stringOp(MyStringOps::strReverse, inStr);

Здесь ссылка на статический метод strReverse(), объявляемый в классе MyStringOps,
передается первому аргументу метода stringOp(). Это вполне допустимо, поскольку метод strReversе()
совместим с функциональным интерфейсом StringFunс. Следовательно, в выражении
МуStringОрs::strReverse
вычисляется ссылка на объект того класса, в котором метод strReverse() предоставляет
реализацию метода func()
из функционального интерфейса StringFunc.
Вывод в консоль:
-------------------------------------------------------------------
Это исходная строка : обращенная строка будет : акортс яандохси отЭ
 */
