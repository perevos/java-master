package ru.bfu.ipmit.codesmells.improvement.bigclass.services;

import ru.bfu.ipmit.codesmells.improvement.bigclass.models.Student;

public class StudentService {

    private DatabaseClient databaseService;

    public StudentService(DatabaseClient databaseService) {
        this.databaseService = databaseService;
    }

    public void enroll(Student student, String courseName) {
        databaseService.callDatabase("Зарегистрировать студента " + student.person.firstName + " на курс '" + courseName + "'");
    }

    public void changeFaculty(Student student, String facultyName) {
        databaseService.callDatabase("Перевести студента " + student.person.firstName + " на факультет '" + facultyName + "'.");
    }

}