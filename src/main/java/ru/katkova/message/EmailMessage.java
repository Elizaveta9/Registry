package ru.katkova.message;

import java.time.LocalDateTime;
import java.util.Random;

public class EmailMessage extends BaseMessage {
    // текст письма
    private String text;
    // заголовок письма
    private String header;

    private EmailMessage() {
        sender = "sales@jetbrains.com";
        receiver = "you@mail.ru";
        timeSent = LocalDateTime.now();
    }

    public EmailMessage(String text, String header) {
        this();
        this.text = text;
        this.header = header;
        appCode = 5;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public String getMarker() {
        return "Email";
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "text='" + text + '\'' +
                ", header='" + header + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", timeSent=" + timeSent +
                '}';
    }
}
