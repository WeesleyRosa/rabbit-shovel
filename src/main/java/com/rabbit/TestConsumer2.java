package com.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TestConsumer2 {

    @RabbitListener(queues = "uniao 2")
    public void receive(String in) {
        System.out.println(" [x] uniao 2 '" + in + "'");
    }

}
