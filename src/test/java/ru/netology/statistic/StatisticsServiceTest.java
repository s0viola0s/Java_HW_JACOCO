package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfMaxNotFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {10, 5, 8, 4, 5, 3, 8, 6, 11, 11, 5};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
