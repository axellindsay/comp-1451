package ca.bcit.comp1451.lab1a.lindsay.alex;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Alex on 2/9/2017.
 *
 * Class to represent a bookstore.
 */
public class BookStore
{
    private ArrayList<Book> books1;
    private Book[] books2;

    public BookStore()
    {
        books1 = new ArrayList<>();
        books2 = new Book[5];

        books1.add(new Book("Life of Pi", 2001, 9, 11));
        books1.add(new Book("Lord of the Flies", 1954, 9, 17));
        books1.add(new Book("A Tale of Two Cities", 1859, 1, 1));
        books1.add(new Book("Alice's Adventures in Wonderland", 1865, 11, 26));
        books1.add(new Book("1Q84", 2009, 5, 29));

        books2[0] = new Book("Life of Pi", new Date(2001, 9, 11));
        books2[1] = new Book("Lord of the Flies", new Date(1954, 9, 17));
        books2[2] = new Book("A Tale of Two Cities", new Date(1859, 1, 1));
        books2[3] = new Book("Alice's Adventures in Wonderland", new Date(1865, 11, 26));
        books2[4] = new Book("1Q84", new Date(2009, 5, 29));
    }

    /**
     * Print book title and date published for the books.
     */
    public void displayBooks()
    {
        Iterator<Book> it = books1.iterator();

        System.out.println("---From books1---");
        System.out.println("=============");

        while (it.hasNext())
        {
            Book b = it.next();

            System.out.println(b.getTitle());
            System.out.println(b.getDatePublished().getDate());
            System.out.println("=============");
        }

        System.out.println("---From books2---");
        System.out.println("=============");

        for (Book b : books2)
        {
            System.out.println(b.getTitle());
            System.out.println(b.getDatePublished().getDate());
            System.out.println("=============");
        }
    }
}
