package ru.bfu.ipmit.lab7.validation.crossfield;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для валидации возраста водителя:
 * - если удостоверение содержит категории "C" или "D", то
 *   при получении удостоверения водитель должен быть возрастом от 21 года
 * - в противном случае водитель должен быть возрастом от 18 лет при получении удостоверения
 *
 * Пример корректных водительских удостоверений:
 * {
 *     // ...
 *     dateOfBirth = "01.01.2000",
 *     validFrom = "01.10.2021",
 *     categories = ["B", "C"]
 *     // ...
 * },
 * {
 *     // ...
 *     dateOfBirth = "01.01.2000",
 *     validFrom = "01.10.2018",
 *     categories = ["B"]
 * }
 *
 * Пример некорректного водительского удостоверения:
 * {
 *     // ...
 *     dateOfBirth = "01.01.2000",
 *     validFrom = "01.10.2018",
 *     categories = ["D"]
 * }
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ValidAge {
}
