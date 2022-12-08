import com.baeldung.soap.ws.client.generated.*;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQDestination;
import org.apache.activemq.command.ActiveMQQueue;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import java.util.Scanner;

public class Client implements Runnable, ExceptionListener {

    private static void getInstructions(Paths paths) {
        for (Instruction instruction : paths.getInstructions().getValue().getInstruction()) {
            System.out.print(instruction.getText().getValue());
            if (Math.round(instruction.getDistance()) != 0) {
                System.out.print(" pendant ");
                System.out.print(Math.round(instruction.getDistance()));
                System.out.print("m");
            }
            System.out.println();
        }
    }

    @Override
    public void run() {

        try{
            // Create a ConnectionFactory
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");

            // Create a Connection
            Connection connection = connectionFactory.createConnection();
            connection.start();

            connection.setExceptionListener(this);

            // Create a Session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // Create the destination (Topic or Queue)
            Destination queue = session.createQueue("queue");

            // Create a MessageConsumer from the Session to the Topic or Queue
            MessageConsumer consumer = session.createConsumer(queue);

            // Wait for a message
            Message message = consumer.receive();

            TextMessage textMessage = (TextMessage) message;
            System.out.println(textMessage.getText());

            String instruction = "";

            while(instruction != null){
                System.in.read();
                message = consumer.receive();
                textMessage = (TextMessage) message;
                if(textMessage==null)
                    break;
                instruction= textMessage.getText();
                System.out.println(instruction);
            }

            ActiveMQConnection mqConnection = (ActiveMQConnection) connection;
            mqConnection.destroyDestination((ActiveMQDestination) queue);
            consumer.close();
            session.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onException(JMSException e) {
        System.out.println("exceptionJMS");
    }
}


