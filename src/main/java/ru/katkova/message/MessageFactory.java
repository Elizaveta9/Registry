package ru.katkova.message;

import java.time.Duration;
import java.util.UUID;

public class MessageFactory {
    public static BaseMessage createMessage(Integer randomCode) {
        return switch (randomCode) {
            case 1 -> new EmailMessage("Вы получили ключ к IntelliJ Ultimate: " + UUID.randomUUID(), "Ключ Ultimate");
            case 2 -> new AudioMessage(Duration.ofSeconds(130));
            case 3 -> new VideoMessage(Duration.ofSeconds(355), "360p");
            default -> throw new RuntimeException("нет данных для обработки");
        };

    }
}
