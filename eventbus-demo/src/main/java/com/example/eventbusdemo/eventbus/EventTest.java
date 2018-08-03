package com.example.eventbusdemo.eventbus;

public class EventTest {

    private final int message;

    public EventTest(int message) {
        this.message = message;
    }

    public int getMessage() {
        return message;
    }

}
