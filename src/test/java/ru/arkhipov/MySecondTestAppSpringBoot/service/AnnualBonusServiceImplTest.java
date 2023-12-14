package ru.arkhipov.MySecondTestAppSpringBoot.service;

import org.junit.jupiter.api.Test;
import ru.arkhipov.MySecondTestAppSpringBoot.model.Positions;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class AnnualBonusServiceImplTest {

    @Test
    void calculate() {

        //given
        Positions positions = Positions.HR;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.00;

        //when
        double result = new AnnualBonusServiceImpl().calculate(positions, salary, bonus, workDays);

        //then
        double expected = 360493.8271604938;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testCalculateQuarterlyBonus() {

        Positions positions = Positions.CEO;
        double salary = 1000.00; // Replace with the desired salary for the test case
        double bonus = 1.5; // Replace with the desired bonus for the test case
        double expected = 1125; // Replace with the expected result for the test case

        double result = new AnnualBonusServiceImpl().calculateQuarterlyBonus(positions, salary, bonus);
        assertThat(result).isEqualTo(expected);
    }
}
