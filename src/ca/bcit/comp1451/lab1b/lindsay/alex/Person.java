package ca.bcit.comp1451.lab1b.lindsay.alex;

/**
 * Created by Alex on 2/8/2017.
 *
 * Class to represent a person.
 */
public class Person
{
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    double x;

    public Person(String firstName, String lastName, int yearOfBirth)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setYearOfBirth(yearOfBirth);
    }

    /**
     * Accessor method for first name.
     * @return firstName as a String
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Accessor method for last name.
     * @return lastName as a String
     */
    public String getLastName()
    {
        return this.lastName;
    }

    /**
     * Accessor method for year of birth.
     * @return yearOfBirth as an int
     */
    public int getYearOfBirth()
    {
        return this.yearOfBirth;
    }

    private void setFirstName(String firstName)
    {
        if (firstName != null && firstName.trim().length() > 0)
        {
            this.firstName = firstName;
        }
    }

    private void setLastName(String lastName)
    {
        if (lastName != null && lastName.trim().length() > 0)
        {
            this.lastName = lastName;
        }
    }

    private void setYearOfBirth(int yearOfBirth)
    {
        if (yearOfBirth > 0)
        {
            this.yearOfBirth = yearOfBirth;
        }
    }
}
