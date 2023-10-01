package H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.consumer;

import H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.broker.MessageBroker;
import H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.model.Message;

import java.util.concurrent.TimeUnit;

public class MessageConsumingTask implements Runnable{
    private static final int SECOND_DURATION_TO_SLEEP_BEFORE_PRODUCED = 1;
    private static final String MESSAGE_OF_MESSAGE_IS_CONSUMED = "Message '%s' is consumed.\n";
    private MessageBroker messageBroker;

    public MessageConsumingTask(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            try {
                TimeUnit.SECONDS.sleep(SECOND_DURATION_TO_SLEEP_BEFORE_PRODUCED);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            Message consumedMessage = this.messageBroker.consum();
            System.out.printf(MESSAGE_OF_MESSAGE_IS_CONSUMED,consumedMessage);
        }
    }
}
