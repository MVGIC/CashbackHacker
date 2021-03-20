package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain200IfAmountIs1800() {
        CashbackHackService service = new CashbackHackService();

        int boundary = 1000;

        int actual = service.remain(1800);
        int exprected = 200;

        assertEquals(actual,exprected);
    }

    @Test
    public void shouldRemainZeroIfAmountIs1000(){
        CashbackHackService service = new CashbackHackService();

        int boundary = 1000;

        int actual = service.remain(1000);
        int exprected = 0;

        assertEquals(actual,exprected);
    }

    @Test
    public void shouldRemain100IfAmountIs900(){
        CashbackHackService service = new CashbackHackService();

        int boundary = 1000;

        int actual = service.remain(900);
        int exprected = 100;

        assertEquals(actual,exprected);
    }
}