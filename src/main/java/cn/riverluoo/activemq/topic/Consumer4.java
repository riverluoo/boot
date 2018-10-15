package cn.riverluoo.activemq.topic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer4 {

    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer4.class);
    Test test = new Test();

    @JmsListener(destination = "return-1")
    public void receive(String message) {
        test.receive(message);

    }

    @JmsListener(destination = "return-2")
    public void receive2(String message) {

        test.receive(message);
    }

    @JmsListener(destination = "return-3")
    public void receive3(String message) {
        test.receive(message);


    }

    @JmsListener(destination = "return-4")
    public void receive4(String message) {

        test.receive(message);


    }

    @JmsListener(destination = "return-5")
    public void receive5(String message) {

        test.receive(message);


    }

}
