package ru.bfu.ipmit.codesmells.examples.bigclass;

import ru.bfu.ipmit.codesmells.examples.bigclass.university.Student;

// пример кода с большим классом (Student)
public class BigClass {

    public static void main(String[] args) {
        Student student = new Student("Иван", "физико-математический");

        student.enroll("информатика");
        student.complainAboutFaculty();
        student.changeFaculty("лингвистика");
        student.notifyStudentAboutExpiredFluorography();
        student.notifyDeanAboutMisbehavior();
    }
}
