package ru.bfu.ipmit.codesmells.improvement.bigclass;

import ru.bfu.ipmit.codesmells.improvement.bigclass.models.Student;
import ru.bfu.ipmit.codesmells.improvement.bigclass.services.DatabaseClient;
import ru.bfu.ipmit.codesmells.improvement.bigclass.services.EmailClient;
import ru.bfu.ipmit.codesmells.improvement.bigclass.services.NotificationService;
import ru.bfu.ipmit.codesmells.improvement.bigclass.services.StudentService;

public class BigClass {

    public static void main(String[] args) {
        StudentService studentService = new StudentService(new DatabaseClient());
        NotificationService notificationService = new NotificationService(new EmailClient());

        Student student = new Student("Иван", "физико-математический");
        studentService.enroll(student, "информатика");
        notificationService.complainAboutFaculty(student);
        studentService.changeFaculty(student, "лингвистика");
        notificationService.notifyStudentAboutExpiredFluorography(student);
        notificationService.notifyDeanAboutMisbehavior(student);
    }

}
