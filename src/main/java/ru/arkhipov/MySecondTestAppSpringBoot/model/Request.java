package ru.arkhipov.MySecondTestAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {
    /***
     * Уникальный индетификатор сообщения
     */
    @NotBlank (message = "uid не может быть пустым!")
    @Size(max = 32)
    private String uid; // Уникальный идентификатор сообщение
    private String operationUid; // Уникальный идентификатор операции
    private Systems systemName; // Имя системы отправителя
    private String systemTime; // Время создания сообщения
    private String source; // Наименование ресурса
    private Positions position; // Должность
    private Double salary; // Зарплата
    private Double bonus; // Премия
    private Integer workDays; // Рабочие дни
    private Integer communicationId; // Уникальный идентификатор коммуникации
    private Integer templateId; // Уникальный идентификатор шаблона
    private Integer productCode; // Код продукта
    private Integer smsCode; // Смс код

    @Override
    public String toString() {
        return "{" +
                "uid='" + uid + '\'' +
                ", operationUid='" + operationUid + '\'' +
                "systemName='" + systemName + '\'' +
                "systemTime='" + systemTime + '\'' +
                "source'" + source + '\'' +
                "communicationId=" + communicationId +
                "templateId=" + templateId +
                "productCode=" + productCode +
                "smsCode" + smsCode +
                "}";
    }
}