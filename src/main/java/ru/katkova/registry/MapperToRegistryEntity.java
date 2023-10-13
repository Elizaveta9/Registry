package ru.katkova.registry;

import ru.katkova.message.AudioMessage;
import ru.katkova.message.BaseMessage;
import ru.katkova.message.EmailMessage;
import ru.katkova.message.VideoMessage;

public class MapperToRegistryEntity {

    /**
     * Переводит объекты дочерних классов BaseMessage в объекты класса RegistryEntity.
     *
     * Принимает BaseMessage. Сначала заполняет поля, относящиеся к родительскому классу,
     * затем приводит к дочернему классу и заполняет соответвующие этому классу поля.
     * Остальные поля остаются null
     **/
    public static RegistryEntity map(BaseMessage message) {
        RegistryEntity registryEntity = new RegistryEntity();

        registryEntity.setSender(message.getSender());
        registryEntity.setReceiver(message.getReceiver());
        registryEntity.setTimeSent(message.getTimeSent());
        registryEntity.setMarker(message.getMarker());
        // находит по словарю название приложения и записывает его вместо номера
        registryEntity.setApplication(AppCodeDictionary.findApp(message.getAppCode()));

        if (message instanceof AudioMessage audioMessage) {
            registryEntity.setDuration(audioMessage.getDuration());
        }
        else if (message instanceof VideoMessage videoMessage) {
            registryEntity.setDuration(videoMessage.getDuration());
            registryEntity.setResolution(videoMessage.getResolution());
        }
        else if (message instanceof EmailMessage emailMessage) {
            registryEntity.setHeader(emailMessage.getHeader());
            registryEntity.setText(emailMessage.getText());
        }

        return registryEntity;
    }
}
