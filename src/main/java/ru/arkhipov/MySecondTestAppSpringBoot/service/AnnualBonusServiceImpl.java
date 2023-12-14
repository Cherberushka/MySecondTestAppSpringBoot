package ru.arkhipov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySecondTestAppSpringBoot.model.Positions;
import ru.arkhipov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;

import java.time.Year;

@Service
public class AnnualBonusServiceImpl implements  AnnualBonusService {
    @Override
    public double calculate(Positions position, double salary, double bonus, int workDays) {
        int daysInYear = Year.now().isLeap() ? 366 : 365;
        return salary * bonus * daysInYear * position.getPositionCoefficient() / workDays;
    }

    @Override
    public double calculateQuarterlyBonus(Positions position, double salary, double bonus) {
        if (position.isManager()) {
            return salary * bonus * position.getPositionCoefficient() / 4;
        } else {
            throw new UnsupportedCodeException("Расчет квартального бонуса поддерживается только для менеджеров и управленцев.");
        }
    }
}
