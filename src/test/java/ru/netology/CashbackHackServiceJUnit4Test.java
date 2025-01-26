package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceJUnit4Test {
    ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();

    @Test
    public void testRemainWhenAmountIs900() {
        assertEquals(100, service.remain(900));
    }

    @Test
    public void testRemainWhenAmountIs0() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void testRemainWhenAmountIs1000() {
        assertEquals(1000, service.remain(1000)); // Это тест должен упасть
    }

    @Test
    public void testRemainWhenAmountIs1100() {
        assertEquals(900, service.remain(1100));
    }
}
