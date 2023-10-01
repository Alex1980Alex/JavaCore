package H_МногопоточноеПрограммирование.A_Example.L_WaitNotify;

import H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.broker.MessageBroker;
import H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.consumer.MessageConsumingTask;
import H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.producer.MessageProducerTask;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        int brokerMaxStoreMessage = 5;
        MessageBroker messageBroker = new MessageBroker(brokerMaxStoreMessage);

        Thread producingThread = new Thread(new MessageProducerTask(messageBroker));
        Thread consumingThread = new Thread(new MessageConsumingTask(messageBroker));

        producingThread.start();
        consumingThread.start();

        producingThread.join();
        consumingThread.join();

    }
}
