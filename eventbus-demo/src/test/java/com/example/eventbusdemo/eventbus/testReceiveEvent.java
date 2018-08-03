package com.example.eventbusdemo.eventbus;

import com.google.common.eventbus.EventBus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testReceiveEvent {

    @Test
    public void testReceiveEvent() {

        EventBus eventBus = new EventBus("test");
        EventListener eventListener = new EventListener();

        eventBus.register(eventListener);

        eventBus.post(new EventTest(200));
        eventBus.post(new EventTest(300));
        eventBus.post(new EventTest(400));

        System.out.println("getLastMessage = " + eventListener.getLastMessage());
        
    }

}
