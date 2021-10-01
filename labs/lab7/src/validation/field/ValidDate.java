package ru.bfu.ipmit.lab7.validation.field;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для валидации того, что строка является датой в формате "DD.MM.YYYY"
 *
 * Пример корректной строки: "01.01.1980"
 * Примеры некорректных строк: "", "01.01.80", "1.1.1980", "1980-01-01"
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ValidDate {
}
