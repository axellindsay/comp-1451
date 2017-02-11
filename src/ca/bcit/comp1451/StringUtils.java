package ca.bcit.comp1451;

/**
 * Created by Alex on 2/11/2017.
 *
 * Class for String utils.
 */
public class StringUtils
{
    /**
     * Check if a String is not null and has a length of greater than 0.
     * @param s String to check.
     * @return True if valid, else false.
     */
    public static boolean isValidString(String s)
    {
        return s != null && s.trim().length() > 0;
    }

    /**
     * Format a String to be capitalized and trimmed.
     * @param s String to format.
     * @return The capitalized and trimmed String.
     */
    public static String capitalizeString(String s)
    {
        s = s.trim();
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static boolean isNumeric(String s)
    {
        try
        {
            Integer.parseInt(s);
        }
        catch(NumberFormatException NFE)
        {
            return false;
        }

        return true;
    }
}
