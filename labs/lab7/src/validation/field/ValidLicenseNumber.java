package ru.bfu.ipmit.lab7.validation.field;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для валидации того, что строка является корректным номером
 * водительского удостоверения, т.е., имеет вид "XX XX XXXXXX", где X - цифра от 0 до 9.
 *
 * Примеры корректных номеров: "00 00 000000", "91 28 665234"
 * Примеры некорректных номеров: "0000000000", "0 0 0", "00 00 ABCDEF"
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ValidLicenseNumber {
}
