package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTestJUnitJupiter {

    @Test
    public void shouldRemain300IfAmountIs1700(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1700;

        int actual = service.remain(1700);
        int expected = 300;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldRemain500IfAmountIs500() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;

        int actual = service.remain(500);
        int expected = 500;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldRemainZeroIfAmountIs1000(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected,actual);
    }
}
