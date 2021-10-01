package ru.bfu.ipmit.lab7.validation.field;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для валидации того, что список категорий транспортных средств содержит
 * одну из категорий B, C или D.
 *
 * Примеры корректных списков категорий: ["B"], ["C"], ["D"], ["A", "B", "C"]
 * Пример некорректных списков категорий: [], ["A"]
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ValidCategories {
}
