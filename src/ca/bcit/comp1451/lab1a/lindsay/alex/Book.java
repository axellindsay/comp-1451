package ca.bcit.comp1451.lab1a.lindsay.alex;

/**
 * Created by Alex on 2/8/2017.
 *
 * Class to represent a book.
 */
public class Book
{
    private String title;
    private Date datePublished;

    /**
     * Book constructor.
     * @param title The title of the book.
     * @param datePublished The date the book was published.
     */
    public Book(String title, Date datePublished)
    {
        this.title = title;
        this.datePublished = datePublished;
    }

    /**
     * Book constructor that will create a date for the date published.
     * @param title The title of the book.
     * @param year The year the book was published.
     * @param month The month the book was published.
     * @param day The day the book was published.
     */
    public Book(String title, int year, int month, int day)
    {
        this.title = title;
        this.datePublished = new Date(year, month, day);
    }
}
