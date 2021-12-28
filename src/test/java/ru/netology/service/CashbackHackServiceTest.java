package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfAmountTrue() {
        int amount = 5900;
        assertEquals(100, service.remain(amount));
    }

    @Test
    public void shouldCalculateIfAmountFalse() {
        int amount = 1000;
        assertEquals(0, service.remain(amount));
    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;
        assertEquals(1000,service.remain(amount));
    }
}