package ru.bfu.ipmit.codesmells.examples.bigclass.university;

import java.util.Date;

public class Student {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String[] courses;
    private String studyProgramName;
    private String universityEmail;
    private String studyProgramManagerEmail;
    private String facultyEmail;
    private String universityName;
    private String universityOfficialAddress;
    private String studyProgramManager;
    private String facultyDean;
    private String universityRector;
    private String facultyAddress;
    private String facultyName;
    private boolean hasDisability;
    private String privateEmail;
    private String currentSemester;
    private String privateAddress;
    private String startYear;
    private Date lastFluorographyTest;
    private DatabaseClient databaseClient;
    private EmailClient emailService;

    public Student(String firstName, String facultyName) {
        this.firstName = firstName;
        this.facultyName = facultyName;
        databaseClient = new DatabaseClient();
        emailService = new EmailClient();
    }

    public void enroll(String courseName) {
        databaseClient.callDatabase("Зарегистрировать студента " + firstName + " на курс '" + courseName + "'");
    }

    public void notifyDeanAboutMisbehavior() {
        emailService.sendNotification("Уважаемый декан! Студент " + firstName + " хулиганит.");
    }

    public void complainAboutFaculty() {
        emailService.sendNotification("Уважаемый ректор! На факультете '" + facultyName + "' меня ничему не учат.");
    }

    public void changeFaculty(String facultyName) {
        databaseClient.callDatabase("Перевести студента " + firstName + " на факультет '" + facultyName + "'.");
    }

    public void notifyStudentAboutExpiredFluorography() {
        emailService.sendNotification("Уважаемый " + firstName + "! Пройдите флюорографию, иначе мы Вас отчислим.");
    }

    public DatabaseClient getDatabaseClient() {
        return databaseClient;
    }

    public EmailClient getEmailClient() {
        return emailService;
    }

}
