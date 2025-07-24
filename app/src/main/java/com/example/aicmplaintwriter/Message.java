package com.example.aicmplaintwriter;

import java.util.Date;

public class Message {
    private String text;
    private User sender;
    private long createdAt;

    public Message(String text, User sender) {
        this.text = text;
        this.sender = sender;
        this.createdAt = new Date().getTime();
    }

    public String getText() {
        return text;
    }

    public User getSender() {
        return sender;
    }

    public long getCreatedAt() {
        return createdAt;
    }
}
