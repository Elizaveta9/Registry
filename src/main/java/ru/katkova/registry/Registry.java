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

    // показ данных с фильтрацией
    public void printAllWithMarker(String marker) {
        for (RegistryEntity e : entities
                .stream()
                .filter(entity -> entity.getMarker().equals(marker))
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
