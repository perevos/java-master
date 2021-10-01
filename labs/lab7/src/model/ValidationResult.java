package ru.bfu.ipmit.lab7.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Класс для результата валидации водительского удостоверения
 */
@Getter
@Setter
public class ValidationResult {
    /**
     * поле isValid хранит информацию о том, является ли информация в водительском
     * удостоверении корректной
     */
    private boolean isValid;

    /**
     * поле validationErrors хранит список сообщений об ошибках, найденных при валидации
     * водительского удостоверения
     */
    private List<String> validationErrors;
}
