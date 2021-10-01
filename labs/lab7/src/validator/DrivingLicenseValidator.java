package ru.bfu.ipmit.lab7.validator;

import ru.bfu.ipmit.lab7.model.DrivingLicense;
import ru.bfu.ipmit.lab7.model.ValidationResult;

/**
 * Интерфейс для валидации водительского удостоверения, который необходимо реализовать
 */
public interface DrivingLicenseValidator {
    ValidationResult validate(DrivingLicense drivingLicense);
}
