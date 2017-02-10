package ca.bcit.comp1451.lab1a.lindsay.alex;

/**
 * Created by Alex on 2/8/2017.
 *
 * Class to represent a date.
 */
public class Date
{
    private int year;
    private int month;
    private int day;

    /**
     * Date constructor
     * @param year Set the year to this value.
     * @param month Set the month to this value.
     * @param day Set the day to this value.
     */
    public Date(int year, int month, int day)
    {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    /**
     * Accessor method for the year.
     * @return year as an int
     */
    public int getYear()
    {
        return this.year;
    }

    /**
     * Accessor method for the month.
     * @return month as an int
     */
    public int getMonth()
    {
        return this.month;
    }

    /**
     * Accessor method for the day.
     * @return day as an int
     */
    public int getDay()
    {
        return this.day;
    }

    /**
     * Returns the date in the format of yyyy-mm-dd
     * @return date as a String
     */
    public String getDate()
    {
        String month = addZeroPrefix(this.month);
        String day = addZeroPrefix(this.day);

        return String.format("%d-%s-%s", this.year, month, day);

    }

    /**
     * Mutator method for the year.
     * @param year as an int
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    /**
     * Mutator method for the month.
     * @param month as an int
     */
    public void setMonth(int month)
    {
        if (month > 0 && month < 13)
        {
            this.month = month;
        }
    }

    /**
     * Mutator method for the day.
     * @param day as an int
     */
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

    private String addZeroPrefix(int item)
    {
        if (item < 10)
        {
            return String.format("0%d", item);
        }
        else
        {
            return String.format("%d", item);
        }
    }
}
