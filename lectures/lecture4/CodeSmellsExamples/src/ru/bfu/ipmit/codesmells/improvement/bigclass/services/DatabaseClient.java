package ru.bfu.ipmit.codesmells.improvement.bigclass.services;

public class DatabaseClient {

    public void callDatabase(String message) {
        System.out.println("Изменения в базе данных: " + message);
    }
}
