package ru.bfu.ipmit.lab7.validation.field;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для валидации того, что строка не является пустой.
 *
 * Пример корректной строки: "Текст"
 * Примеры некорректных строк: null, "", "   "
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NotBlank {
}
