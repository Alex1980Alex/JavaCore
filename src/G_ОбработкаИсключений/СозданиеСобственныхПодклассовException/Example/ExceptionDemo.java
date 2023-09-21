package G_ОбработкаИсключений.СозданиеСобственныхПодклассовException.Example;

public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println(" Bызoв compute (" + a + " ) ");
        if (a > 10)
            throw new MyException(a);
        System.out.println(" Hopмaльнoe завершение ");
    }
        public static void main (String[]args ){
            try {
                compute(1);
                compute(20);
            } catch(MyException е){
                    System.out.println(" Пepexвaчeнo исключение " + е);
                }

        }
    }
