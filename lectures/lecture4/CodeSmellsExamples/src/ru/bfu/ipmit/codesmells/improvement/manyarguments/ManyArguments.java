package ru.bfu.ipmit.codesmells.improvement.manyarguments;

// корректировка метода с длинным списком аргументов
public class ManyArguments {

    // добавить студента очной формы обучения
    public static void addFullTimeStudent() {
        Student student = new Student();
        student.firstName = "Иванова";
        student.lastName = "Татьяна";
        student.isBachelor = false;
        student.isRemote = false;
        student.hasGithubProfile = true;
        student.hasValidFluorographyTest = true;
        student.isAdmittedToExams = true;

        addStudentToDatabase(student);
    }

    // добавить студента удаленной формы обучения
    public static void addRemoteStudent() {
        Student student = new Student();
        student.firstName = "Иванов";
        student.lastName = "Иван";
        student.isBachelor = true;
        student.isRemote = true;
        student.hasGithubProfile = true;
        student.hasValidFluorographyTest = false;
        student.isAdmittedToExams = true;

        addStudentToDatabase(student);
    }

    private static void addStudentToDatabase(Student student) {
        // добавление студента в базу данных
    }

}
