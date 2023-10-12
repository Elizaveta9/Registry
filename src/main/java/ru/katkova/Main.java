package ru.katkova;

import ru.katkova.message.BaseMessage;
import ru.katkova.message.MessageFactory;
import ru.katkova.registry.MapperToRegistryEntity;
import ru.katkova.registry.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();
        int countMessage = 10;

        // маркеры для фильтрации по ним (для метода printAllWithMarker() реестра)
        String markerAudio = "Audio";
        String markerVideo = "Video";
        String markerEmail = "Email";

        // список для хранения сообщений из внешних систем
        List<BaseMessage> messages = new ArrayList<>();

        // заполняет список генерируемыми данными
        for (int i = 0; i < countMessage; i++) {
            messages.add(MessageFactory.createMessage(randomInt()));
        }

        // передаёт в реестр сообщения, приведённые к классу RegistryEntity
        for (BaseMessage m : messages) {
            registry.add(MapperToRegistryEntity.map(m));
        }

        // вывод данных
        registry.printAll();
        System.out.println("=============================================================");
        registry.printAllWithMarker(markerEmail);
    }

    static Integer randomInt() {
        int min = 1, max = 3;
        return new Random().nextInt(min, max + 1);
    }
}