package ca.bcit.comp1451.assignment1.lindsay.alex;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Alex on 2/25/2017.
 *
 */
class BookStore extends Store {

    private BookType specialty;

    public BookStore(Address address, String name, BookType specialty)
    {
        super(address, name);
        this.specialty = specialty;
        addBooks();
    }

    public BookStore(Address address, String name, String specialty)
    {
        super(address, name);
        this.specialty = BookType.get(specialty);
        addBooks();
    }

    public void displayAllBooksWrittenByAuthorsOverThisAge(int ageInYears)
    {
        Collection<Book> books = getCollectionOfItems(); // From the Store class
        Iterator<Book> it = books.iterator();
        boolean displayedSome = false;
        while (it.hasNext()) {
            Book b = it.next();
            int ageYears = b.getDatePublished().getYear() - b.getAuthor().getBirthDate().getYear();
            if (ageYears > ageInYears) {
                System.out.println(b.getTitle() + " was written by " +
                        b.getAuthor().getName().getLastName() + " at age " + ageYears +
                        ", which is more than " + ageInYears);
                displayedSome = true;
            }
        }
        if (displayedSome == false) {
            System.out.println("No books by authors over age " + ageInYears);
        }
    }

    private void addBooks()
    {
        Date birthDate = new Date(1919, 1, 1);
        Name name = new Name("Jerome", "David", "Salinger");
        BookType genre = BookType.get("fiction");
        Author author = new Author(birthDate, name, genre, "JD");
        Date datePublished = new Date(1951, 5, 14);
        String title = "The Catcher in the Rye";
        Book b = new Book(0.4, 2.0, 4.0, "1234", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1948, 1, 31);
        title = "A Perfect Day for Bananafish";
        genre = BookType.get("fiction");
        b = new Book(1, 11, 12, "2345", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1945, 12, 12);
        title = "A Boy in France";
        genre = BookType.get("fiction");
        b = new Book(2, 33, 35, "3456", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1963, 9, 3);
        name = new Name("Malcolm", "Gladwell");
        genre = BookType.get("nonfiction");
        author = new Author(birthDate, name, genre);
        datePublished = new Date(2008, 11, 18);
        title = "Outliers";
        b = new Book(2.1, 2, 6, "4567", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(2000, 3, 1);
        title = "The Tipping Point";
        genre = BookType.get("nonfiction");
        b = new Book(0.5, 3, 5, "5678", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1919, 11, 26);
        name = new Name("Frederik", "Pohl");
        genre = BookType.get("sciencefiction");
        author = new Author(birthDate, name, genre, "Paul Dennis Lavond");
        datePublished = new Date(1977, 7, 4);
        title = "Gateway";
        b = new Book(0.01, 4, 4, "6789", author, datePublished, title, genre);
        addItem(b);
        datePublished = new Date(1937, 10, 6);
        title = "Elegy to a Dead Planet: Luna";
        genre = BookType.get("sciencefiction");
        b = new Book(0.1, 5, 11, "abcd", author, datePublished, title, genre);
        addItem(b);

        birthDate = new Date(1918, 5, 11);
        name = new Name("Richard", "Phillips", "Feynman");
        genre = BookType.get("reference");
        author = new Author(birthDate, name, genre);
        datePublished = new Date(1942, 5, 20);
        title = "Principle of Least Action in Quantum Mechanics";
        b = new Book(0.8, 15, 30, "efgh", author, datePublished, title, genre);
        addItem(b);

        datePublished = new Date(1964, 6, 30);
        title = "The Messenger Lectures";
        genre = BookType.get("reference");
        b = new Book(0.6, 44, 45.5, "ijkl", author, datePublished, title, genre);
        addItem(b);
        datePublished = new Date(1985, 11, 1);
        title = "Surely You're Joking Mr. Feynman";
        genre = BookType.get("nonfiction");
        b = new Book(1.0, 3, 13, "mnop", author, datePublished, title, genre);
        addItem(b);
    }
}