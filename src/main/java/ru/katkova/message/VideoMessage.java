package ru.katkova.message;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

public class VideoMessage extends BaseMessage {
    // длительность
    private Duration duration;
    // разрешение
    private String resolution;

    private VideoMessage() {
        sender = "mother";
        receiver = "son";
        timeSent = LocalDateTime.now().minusMinutes(46);
        appCode = new Random().nextInt(1,5);
    }

    public VideoMessage(Duration duration, String resolution) {
        this();
        this.duration = duration;
        this.resolution = resolution;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String getMarker() {
        return "Video";
    }

    @Override
    public String toString() {
        return "VideoMessage{" +
                "duration=" + duration +
                ", resolution='" + resolution + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", timeSent=" + timeSent +
                '}';
    }
}
