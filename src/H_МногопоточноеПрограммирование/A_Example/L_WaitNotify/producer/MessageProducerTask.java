package H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.producer;

import H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.broker.MessageBroker;
import H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.model.Message;

import java.util.concurrent.TimeUnit;

public class MessageProducerTask implements Runnable{
    private static final String MESSAGE_OF_MESSAGE_IS_PRODUCED = "Message '%s' is produced.\n";
    private static final int SECOND_DURATION_TO_SLEEP_BEFORE_PRODUCED = 1;
    private MessageBroker messageBroker;

    public MessageProducerTask(MessageBroker messageBroker) {
        this.messageBroker = messageBroker;
        this.messageFactory = new MessageFactory();

    }

    private MessageFactory messageFactory;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            Message producedMessage = this.messageFactory.create();
            try {
                TimeUnit.SECONDS.sleep(SECOND_DURATION_TO_SLEEP_BEFORE_PRODUCED);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            this.messageBroker.produce(producedMessage);
            System.out.printf(MESSAGE_OF_MESSAGE_IS_PRODUCED, producedMessage);
        }
    }

    private static class MessageFactory{
        private static final int INITIAL_NEXT_MESSAGE_INDEX = 1;
        private static final String  TEMPLATE_CREATED_MESSAGE_DATE = "Message%d";
        private int nextMessageIndex;

        public MessageFactory() {
            this.nextMessageIndex = INITIAL_NEXT_MESSAGE_INDEX;
        }
        public Message create(){
            // используется для форматирования строковых значений с использованием спецификаторов формата,
            // подобно тому, как это делается в функции printf() в языке программирования C
            return new Message(String.format(TEMPLATE_CREATED_MESSAGE_DATE, this.nextMessageIndex++));
        }
    }
}
