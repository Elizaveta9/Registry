package ru.katkova.message;

import java.time.LocalDateTime;

public abstract class BaseMessage {
    // отправитель
    String sender;
    // получатель
    String receiver;
    // время отправки
    LocalDateTime timeSent;
    // код приложения, с помощью которого быол отправлено сообщение (расшифровка кодов в AppCodesDictionary)
    Integer appCode;

    public abstract String getMarker();

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public LocalDateTime getTimeSent() {
        return timeSent;
    }

    public void setTimeSent(LocalDateTime timeSent) {
        this.timeSent = timeSent;
    }

    public Integer getAppCode() {
        return appCode;
    }

    public void setAppCode(Integer appCode) {
        this.appCode = appCode;
    }
}
