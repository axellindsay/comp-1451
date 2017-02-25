package ca.bcit.comp1451.assignment1.lindsay.alex;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 2/25/2017.
 */
public enum ShoeType
{
    WOMEN("women"),
    MEN("men"),
    CHILDREN("children"),
    SPORTS("sports"),
    DRESS("dress");

    private String theShoeType;

    private static Map<String, ShoeType> lookup = new HashMap<String, ShoeType>();

    static
    {
        for (ShoeType s : ShoeType.values())
        {
            lookup.put(s.getTheShoeType(), s);
        }
    }

    private ShoeType(String theShoeType)
    {
        this.theShoeType = theShoeType;
    }

    public String getTheShoeType()
    {
        return theShoeType;
    }

    public static ShoeType get(String theShoeType)
    {
        return lookup.get(theShoeType);
    }
}
