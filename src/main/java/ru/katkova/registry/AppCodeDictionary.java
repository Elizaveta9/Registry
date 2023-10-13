package ru.katkova.registry;

public class AppCodeDictionary {
    public static String findApp(Integer appCode) {
        return switch (appCode) {
            case 1 -> "Telegram";
            case 2 -> "Вконтакте";
            case 3 -> "WhatsApp";
            case 4 -> "Viber";
            case 5 -> "Mail.ru";
            default -> "Неизвестный мессенджер";
        };
    }

}
