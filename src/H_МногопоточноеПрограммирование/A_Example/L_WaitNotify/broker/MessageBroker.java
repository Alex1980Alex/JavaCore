package H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.broker;

import H_МногопоточноеПрограммирование.A_Example.L_WaitNotify.model.Message;

import java.util.ArrayDeque;
import java.util.Queue;

public class MessageBroker {
    private final Queue<Message>messagesToBeConsumed;
    private final int maxStoredMessage;

    public MessageBroker(int maxStoredMessage) {
        this.maxStoredMessage = maxStoredMessage;
        this.messagesToBeConsumed = new ArrayDeque<>(maxStoredMessage);
    }

    public synchronized void produce(Message message){
        this.messagesToBeConsumed.add(message);
    }
    public synchronized Message consum(){
        // метод poll() используемый для извлечения и удаления элемента из начала очереди.
        // Если очередь пуста, то метод poll() возвращает null
        return this.messagesToBeConsumed.poll();
    }

}
