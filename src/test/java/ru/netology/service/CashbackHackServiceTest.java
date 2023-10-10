package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    public void shouldTestCashBackWhenItsUnder1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestWhenItsAbove1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 300;
        int actual = service.remain(1700);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestWhenIts1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

}
