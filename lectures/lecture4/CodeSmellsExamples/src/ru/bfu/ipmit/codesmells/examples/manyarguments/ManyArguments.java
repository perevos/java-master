package ru.bfu.ipmit.codesmells.examples.manyarguments;

// пример кода с методом с длинным списком параметров
public class ManyArguments {

    // добавить студента очной формы обучения
    public static void addFullTimeStudent() {
        addStudentToDatabase("Иванова", "Татьяна", false, false, true, true, true);
    }

    // добавить студента удаленной формы обучения
    public static void addRemoteStudent() {
        addStudentToDatabase("Иванов", "Иван", true, false, true, false, true);
    }

    // метод с длинным списком параметров
    private static void addStudentToDatabase(String firstName, String lastName, boolean isBachelor,
                                             boolean isRemote, boolean hasGithubProfile,
                                             boolean hasValidFluorographyTest, boolean isAdmittedToExams) {
        // добавление студента в базу данных
    }

}
