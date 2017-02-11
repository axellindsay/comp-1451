package ca.bcit.comp1451.lab2a.lindsay.alex;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDate
{
    private Date date1;
    private Date date2;
    private Date date3;

    @Before
    public void setUp()
    {
        date1 = new Date(16, 8, 1989);
        date2 = new Date(20, 3, 1950);
        date3 = new Date(5, 5, 2000);
    }

    @After
    public void tearDown()
    {
        date1 = null;
        date2 = null;
        date3 = null;
    }

    @Test
    public void test1()
    {
        assertEquals("Wednesday", date1.getDayOfTheWeek());
        assertEquals("Monday", date2.getDayOfTheWeek());
        assertEquals("Friday", date3.getDayOfTheWeek());
    }

    @Test
    public void test2()
    {
        assertEquals(false, date1.isLeapYear());
        assertEquals(false, date2.isLeapYear());
        assertEquals(true, date3.isLeapYear());
    }
}