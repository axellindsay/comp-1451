package ca.bcit.comp1451.assignment1.lindsay.alex;

import ca.bcit.comp1451.StringUtils;

/**
 * Created by Alex on 2/25/2017.
 */
public class Book extends Item
{
    private Author author;
    private Date datePublished;
    private String title;
    private BookType genre;

    public Book(double weightInKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars, String uniqueID, Author author, Date datePublished, String title, BookType genre)
    {
        super(weightInKg, manufacturingPriceDollars, suggestedRetailPriceDollars, uniqueID);
        setAuthor(author);
        setDatePublished(datePublished);
        setTitle(title);
        setGenre(genre);
    }

    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

    public Date getDatePublished()
    {
        return datePublished;
    }

    public void setDatePublished(Date datePublished)
    {
        this.datePublished = datePublished;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        if (StringUtils.isValidString(title))
        {
            this.title = title;
        }
    }

    public BookType getGenre()
    {
        return genre;
    }

    public void setGenre(BookType genre)
    {
        this.genre = genre;
    }

    public String getISBN()
    {
        return getUniqueID();
    }

    public void setISBN(String isbn)
    {
        setUniqueID(isbn);
    }
}
