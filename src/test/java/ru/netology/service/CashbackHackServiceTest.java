package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldTestIfLessBoundary() {
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIfEqualBoundary() {
        int actual = service.remain(100);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIfMoreBoundary() {
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }
}