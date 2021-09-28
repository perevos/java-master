package ru.bfu.ipmit.codesmells.improvement.bigclass.models;

public class Student {

    public Person person;
    public HealthInfo healthInfo;
    public StudyInfo studyInfo;
    public StudyProgram studyProgramInfo;
    public Faculty faculty;
    public University university;

    public Student(String firstName, String facultyName) {
        person = new Person();
        person.firstName = firstName;

        faculty = new Faculty();
        faculty.facultyName = facultyName;
    }

}
