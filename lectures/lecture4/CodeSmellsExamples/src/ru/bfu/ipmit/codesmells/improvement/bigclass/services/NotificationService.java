package ru.bfu.ipmit.codesmells.improvement.bigclass.services;

import ru.bfu.ipmit.codesmells.improvement.bigclass.models.Student;

public class NotificationService {

    private EmailClient emailService;

    public NotificationService(EmailClient emailService) {
        this.emailService = emailService;
    }

    public void notifyDeanAboutMisbehavior(Student student) {
        emailService.sendNotification("Уважаемый декан! Студент " + student.person.firstName + " хулиганит.");
    }

    public void complainAboutFaculty(Student student) {
        emailService.sendNotification("Уважаемый ректор! На факультете '" + student.faculty.facultyName + "' меня ничему не учат.");
    }

    public void notifyStudentAboutExpiredFluorography(Student student) {
        emailService.sendNotification("Уважаемый " + student.person.firstName + "! Пройдите флюорографию, иначе мы Вас отчислим.");
    }

}
