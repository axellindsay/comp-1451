package ca.bcit.comp1451.assignment1.lindsay.alex;

/**
 * Created by Alex on 2/25/2017.
 */
public class Author
{
    private Date birthDate;
    private Name name;
    private BookType genre;
    private String pseudonym;

    public Author(Date birthDate, Name name, BookType genre)
    {
        
    }

    public Author(Date birthDate, Name name, BookType genre, String pseudonym)
    {

    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public BookType getGenre() {
        return genre;
    }

    public void setGenre(BookType genre) {
        this.genre = genre;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }
}
