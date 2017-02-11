package ca.bcit.comp1451.lab2a.lindsay.alex;

import java.util.HashMap;

/**
 * Created by Alex on 2/9/2017.
 *
 * Class to represent a date.
 */
public class Date
{
    public static final int EARLIEST_YEAR = 1600;
    private int year;
    private int month;
    private int day;
    private HashMap<Integer, Integer> monthCode = new HashMap(); // KEY is month number, VALUE is month code.
    private HashMap<Integer, String> dayCode = new HashMap(); // KEY is day code, VALUE is day.

    public Date(int day, int month, int year)
    {
        setYear(year);
        setMonth(month);
        setDay(day);

        monthCode.put(1, 1);
        monthCode.put(2, 4);
        monthCode.put(3, 4);
        monthCode.put(4, 0);
        monthCode.put(5, 2);
        monthCode.put(6, 5);
        monthCode.put(7, 0);
        monthCode.put(8, 3);
        monthCode.put(9, 6);
        monthCode.put(10, 1);
        monthCode.put(11, 4);
        monthCode.put(12, 6);

        dayCode.put(0, "Saturday");
        dayCode.put(1, "Sunday");
        dayCode.put(2, "Monday");
        dayCode.put(3, "Tuesday");
        dayCode.put(4, "Wednesday");
        dayCode.put(5, "Thursday");
        dayCode.put(6, "Friday");
    }

    public int getYear()
    {
        return this.year;
    }

    public void setYear(int year)
    {
        if (year >= EARLIEST_YEAR) { this.year = year; }
    }

    public int getMonth()
    {
        return this.month;
    }

    public void setMonth(int month)
    {
        if (month > 0 && month < 13)
        {
            this.month = month;
        }
    }

    public int getDay()
    {
        return this.day;
    }

    public void setDay(int day)
    {
        switch (this.month)
        {
            case 2: {
                if (day < 30)
                {
                    this.day = day;
                }
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                if (day < 32)
                {
                    this.day = day;
                }
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                if (day < 31)
                {
                    this.day = day;
                }
            }
        }
    }

    public String getDayOfTheWeek()
    {
        String strNum = String.valueOf(this.year);

        int lastTwoDigits = getPartOfInt(strNum, strNum.length() - 2, strNum.length());
        int step1 = lastTwoDigits / 12;
        int step2 = lastTwoDigits % 12;
        int step3 = step2 / 4;
        int step4 = this.day;
        int step5 = this.monthCode.get(this.month);

        if (isLeapYear())
        {
            if (this.month == 1 || this.month == 2)
            {
                step5 -= 1;
            }
        }

        switch (getPartOfInt(strNum, 0, 2))
        {
            case 16:
            {
                step5 += 6;
                break;
            }
            case 17:
            {
                step5 += 4;
                break;
            }
            case 18:
            {
                step5 += 2;
                break;
            }
            case 20:
            {
                step5 += 6;
                break;
            }
            case 21:
            {
                step5 += 4;
                break;
            }

        }

        int finalStep = (step1 + step2 + step3 + step4 + step5) % 7;

        return dayCode.get(finalStep);
    }

    private int getPartOfInt(String strNum, int start, int end)
    {
        strNum = strNum.substring(start, end);
        return Integer.parseInt(strNum);
    }

    public boolean isLeapYear()
    {
        if (this.year % 4 == 0)
        {
            if (this.year % 100 == 0)
            {
                if (this.year % 400 == 0)
                {
                    return true;
                }
                else // Divisible by 4 and 100 but not by 400.
                {
                    return false;
                }
            }
            else // Divisible by 4 but not by 100.
            {
                 return true;
            }
        }
        else // Not divisible by 4.
        {
            return false;
        }
    }
}
