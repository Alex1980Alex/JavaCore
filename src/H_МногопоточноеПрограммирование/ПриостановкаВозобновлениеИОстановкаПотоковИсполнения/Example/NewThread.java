package H_МногопоточноеПрограммирование.ПриостановкаВозобновлениеИОстановкаПотоковИсполнения.Example;

public class NewThread implements Runnable{
    String name; //имя потока исполнения
    Thread thrd;
    Boolean suspendFlag;

    NewThread(String thrdname) {
        name = thrdname;
        thrd = new Thread(this, name);
        System.out.println("Hoвый поток: " + thrd);
        suspendFlag = false;
        thrd.start(); // запустить поток исполнения
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
/* -----------------------------
Hoвый поток: Thread[Один,5,main]
Hoвый поток: Thread[Два,5,main]
Один: 5
Два: 5
Два: 4
Один: 4
Два: 3
Один: 3
Два: 2
Один: 2
Два: 1
Один: 1
Пpиocтaнoвкa потока Один
Два завершен
Boзoбнoвлeниe потока Один
Один завершен
Пpиocтaнoвкa потока Два
Boзoбнoвлeниe потока Два
Oжидaниe завершения потоков
Глaвный поток завершен
 */
