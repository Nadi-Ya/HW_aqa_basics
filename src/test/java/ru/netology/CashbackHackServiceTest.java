package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();

    @Test
    public void testRemainWhenAmountIs900() {
        assertEquals(service.remain(900), 100);
    }

    @Test
    public void testRemainWhenAmountIs0() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        assertEquals(service.remain(1000), 1000); // Это тест должен упасть
    }

    @Test
    public void testRemainWhenAmountIs1100() {
        assertEquals(service.remain(1100), 900);
    }
}
