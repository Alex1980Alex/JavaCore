package G_ОбработкаИсключений.СозданиеСобственныхПодклассовException.Example;

public class MyException extends Exception {
    private int detail;

    MyException(int а) {
        detail = а;
    }
        public String toString() {
            return "MyException [" + detail + "]";

    }
}
