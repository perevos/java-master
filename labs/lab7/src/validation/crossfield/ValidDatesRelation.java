package ru.bfu.ipmit.lab7.validation.crossfield;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для проверки корректного соотношения дат на водительском удостоверении:
 * - дата рождения перед датой выдачи удостоверения
 * - дата выдачи удостоверения перед датой окончания срока действия удостоверения
 *
 * Пример корректного удостоверения:
 * {
 *     // ...
 *     dateOfBirth = "01.01.1980"
 *     validFrom = "01.10.2021"
 *     validTo = "01.10.2031"
 *     // ...
 * }
 *
 * Примеры некорректных удостоверений:
 * {
 *     // ...
 *     dateOfBirth = "01.01.2020",
 *     validFrom = "01.01.1900",
 *     validTo = "01.01.1910"
 *     // ...
 * },
 * {
 *     // ...
 *     dateOfBirth = "01.01.1980",
 *     validFrom = "01.10.2021",
 *     validTo = "01.10.2020",
 *     // ...
 * }
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ValidDatesRelation {
}
