package ru.bfu.ipmit.codesmells.examples.bigclass.university;

public class DatabaseClient {

    public void callDatabase(String message) {
        System.out.println("Изменения в базе данных: " + message);
    }
}
