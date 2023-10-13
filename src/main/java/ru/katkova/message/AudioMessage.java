package ru.katkova.message;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

public class AudioMessage extends BaseMessage {
    // длительность
    private Duration duration;

    private AudioMessage() {
        sender = "Friend";
        receiver = "You";
        timeSent = LocalDateTime.now().minusHours(5);
    }

    public AudioMessage(Duration duration) {
        this();
        this.duration = duration;
        appCode = new Random().nextInt(1,5);
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String getMarker() {
        return "Audio";
    }

    @Override
    public String toString() {
        return "AudioMessage{" +
                "duration=" + duration +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", timeSent=" + timeSent +
                '}';
    }
}
