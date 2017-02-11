package ca.bcit.comp1451.quiz4.lindsay.alex;

public class Book
{
    public static final String FIRST_BOOK_PUBLISHED_YEAR = "1455";
    private static String activity = "Reading";
    private int yearPublished;
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(int yearPublished, String title, String authorFirstName, String authorLastName)
    {
        setYearPublished(yearPublished);
        setTitle(title);
        setAuthorFirstName(authorFirstName);
        setAuthorLastName(authorLastName);
    }

    public void setYearPublished(int year)
    {
        if (year >= Integer.parseInt(FIRST_BOOK_PUBLISHED_YEAR))
        {
            this.yearPublished = year;
        }
    }

    public void setTitle(String title)
    {
        if (title != null && title.trim().length() > 0)
        {
            this.title = title.substring(0, 1).toUpperCase() + title.substring(1).toLowerCase();
        }
    }

    public void setAuthorFirstName(String name)
    {
        if (name != null && name.trim().length() > 0)
        {
            this.authorFirstName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
    }

    public void setAuthorLastName(String name)
    {
        if (name != null && name.trim().length() > 0)
        {
            this.authorLastName = name.substring(0, name.length() - 1).toLowerCase() + name.substring(name.length() - 1).toUpperCase();
        }
    }

    public String getAuthorInitials()
    {
        return this.authorFirstName.substring(0, 1) + "." + this.authorLastName.substring(0, 1).toUpperCase() + ".";
    }

    public String getTitle()
    {
        return this.title;
    }

    public int getYearPublished()
    {
        return this.yearPublished;
    }

    public String getAuthorFirstName()
    {
        return this.authorFirstName;
    }

    public String getAuthorLastName()
    {
        return this.authorLastName;
    }

    public static String getActivity()
    {
        return activity;
    }

    public String getDetails()
    {
        return (this.title + " was published by " + this.authorFirstName + " " + this.authorLastName + " in " + this.yearPublished + "!").toUpperCase();
    }
}