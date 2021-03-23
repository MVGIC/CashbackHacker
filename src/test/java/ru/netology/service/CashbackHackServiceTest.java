package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain100IfAmountIs900(){
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldRemain200IfAmountIs1800() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1800;

        int actual = service.remain(1800);
        int expected = 200;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldRemainZeroIfAmountIs1000(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);
    }
}