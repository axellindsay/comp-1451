package ca.bcit.comp1451.assignment1.lindsay.alex;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 2/25/2017.
 *
 */
public enum BookType {

    FICTION("fiction"),
    NONFICTION("nonfiction"),
    SCIENCEFICTION("sciencefiction"),
    REFERENCE("reference");

    private String theBookType;

    private static Map<String, BookType> lookup = new HashMap<String, BookType>();

    static
    {
        for (BookType b : BookType.values())
        {
            lookup.put(b.getTheBookType(), b);
        }
    }

    private BookType(String theBookType)
    {
        this.theBookType = theBookType;
    }

    public String getTheBookType()
    {
        return theBookType;
    }

    public static BookType get(String theBookType)
    {
        return lookup.get(theBookType);
    }
}
