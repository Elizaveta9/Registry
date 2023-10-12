package ru.katkova.registry;

import java.time.Duration;
import java.time.LocalDateTime;

// Содержит все возможные поля классов XxxMessage и поле id
public class RegistryEntity {
    private static Integer count = 0;
    private Integer id;

    private String marker;
    private String sender;
    private String receiver;
    private LocalDateTime timeSent;
    private Duration duration;
    private String text;
    private String header;
    private String resolution;

    public RegistryEntity() {
        id = count;
        count++;
    }

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

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
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

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Integer getId() {
        return id;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public String toString() {
        return "RegistryEntity{" +
                "id=" + id +
                ", marker='" + marker + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", timeSent=" + timeSent +
                ", duration=" + duration +
                ", text='" + text + '\'' +
                ", header='" + header + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
