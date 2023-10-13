package ru.katkova.registry;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private List<RegistryEntity> entities = new ArrayList<>();

    public Registry() {
    }

    // добавление записи в реестр
    public void add(RegistryEntity entity) {
        entities.add(entity);
    }

    // показ данных с фильтрацией по маркеру
    public void printAllWithMarker(String marker) {
        for (RegistryEntity e : entities
                .stream()
                .filter(entity -> entity.getMarker().equals(marker))
                .toList()) {
            System.out.println(e);
        }
    }

    // показ данных с фильтрацией по приложению
    public void printAllWithApplication(String application) {
        for (RegistryEntity e : entities
                .stream()
                .filter(entity -> entity.getApplication().equals(application))
                .toList()) {
            System.out.println(e);
        }
    }

    // показ всех данных
    public void printAll() {
        for (RegistryEntity e : entities) {
            System.out.println(e);
        }
    }
}
