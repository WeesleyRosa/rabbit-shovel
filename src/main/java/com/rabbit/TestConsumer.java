package com.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TestConsumer {

    @RabbitListener(queues = "uniao")
    public void receive(String in) {
        System.out.println(" [x] uniao1 '" + in + "'");
    }

}
