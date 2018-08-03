package com.example.eventbusdemo.eventbus;

import com.google.common.eventbus.Subscribe;

public class EventListener {

    public int lastMessage = 0;

    @Subscribe
    public void listen(EventTest eventTest) {

        lastMessage = eventTest.getMessage();
        System.out.println("Message: " + lastMessage);

    }


    public int getLastMessage() {
        return lastMessage;
    }

}
