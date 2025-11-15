package ru.netology.testng;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;


public class CashbackHackerServiceTest {

    @Test
    public void shouldAdd100WhenAmount900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected, "если сумма покупки 900 - для получения кэшбэка надо докупить еше на 100");
    }

    @Test
    public void shouldAdd1WhenAmount999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected, "если сумма покупки 999 - для получения кэшбэка надо докупить еше на 1");
    }

    @Test
    public void shouldReturn999WhenAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected, "если сумма покупки 1000 - для получения кэшбэка не над  о докупать");
    }
}