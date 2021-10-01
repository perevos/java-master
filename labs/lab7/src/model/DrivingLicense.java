package ru.bfu.ipmit.lab7.model;

import lombok.Getter;
import lombok.Setter;
import ru.bfu.ipmit.annotation.*;
import ru.bfu.ipmit.lab7.validation.crossfield.ValidAge;
import ru.bfu.ipmit.lab7.validation.crossfield.ValidDatesRelation;
import ru.bfu.ipmit.lab7.validation.field.NotBlank;
import ru.bfu.ipmit.lab7.validation.field.ValidCategories;
import ru.bfu.ipmit.lab7.validation.field.ValidDate;
import ru.bfu.ipmit.lab7.validation.field.ValidLicenseNumber;

import java.util.List;

/**
 * Класс DrivingLicense содержит атрибуты водительского удостоверения
 */
@Getter
@Setter
@ValidDatesRelation
@ValidAge
public class DrivingLicense {

    /**
     * фамилия (например, "Иванов")
     */
    @NotBlank
    private String surname;

    /**
     * имя и отчество (например, "Иван Иванович")
     */
    @NotBlank
    private String otherNames;

    /**
     * дата рождения (например, "01.01.1980")
     */
    @ValidDate
    private String dateOfBirth;

    /**
     * место рождения (например, "Калининград")
     */
    @NotBlank
    private String placeOfBirth;

    /**
     * дата выдачи (например, "01.10.2021")
     */
    @ValidDate
    private String validFrom;

    /**
     * дата окончания срока действия удостоверения (например, "01.10.2031")
     */
    @ValidDate
    private String validTo;

    /**
     * код подразделения Госавтоинспекции, выдавшего водительское удостоверение (например, "ГИБДД 3901")
     */
    @NotBlank
    private String issuingAuthority;

    /**
     * номер удостоверения (например "00 00 000000")
     */
    @ValidLicenseNumber
    private String licenseNumber;

    /**
     * место жительства (например, "Калининград")
     */
    @NotBlank
    private String placeOfResidence;

    /**
     * категории транспортных средств, на право управления которыми выдано удостоверение
     * (например, ["A", "B", "BE"])
     */
    @ValidCategories
    private List<String> categories;

}
