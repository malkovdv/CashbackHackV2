package ru.netology.unit4;

import org.junit.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;

public class CashbackHackerP2Test {


    @Test
    public void shouldAdd100WhenAmount900() {
        CashbackHackService cashbackHacker = new CashbackHackService();
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd0WhenAmount1000() {
        CashbackHackService cashbackHacker = new CashbackHackService();
        int actual = cashbackHacker.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdd1WhenAmount999() {
        CashbackHackService cashbackHacker = new CashbackHackService();
        int actual = cashbackHacker.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

}