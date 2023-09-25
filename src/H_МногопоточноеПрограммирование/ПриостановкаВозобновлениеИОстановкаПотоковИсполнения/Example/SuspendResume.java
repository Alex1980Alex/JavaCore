package H_МногопоточноеПрограммирование.ПриостановкаВозобновлениеИОстановкаПотоковИсполнения.Example;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("Один");
        NewThread obj2 = new NewThread("Два");

        try {

            Thread.sleep(1000);
            obj1.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Один");

            Thread.sleep(1000);
            obj1.myresume();
            System.out.println("Boзoбнoвлeниe потока Один");

            Thread.sleep(1000);
            obj2.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Два");

            Thread.sleep(1000);
            obj2.myresume();
            System.out.println("Boзoбнoвлeниe потока Два");
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }

        // ожидать завершения потоков исполнения
        try {
            System.out.println("Oжидaниe завершения потоков");
            obj1.thrd.join();
            obj2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен");
    }
}
