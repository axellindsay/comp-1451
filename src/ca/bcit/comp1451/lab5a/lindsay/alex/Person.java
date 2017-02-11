package ca.bcit.comp1451.lab5a.lindsay.alex;

import ca.bcit.comp1451.StringUtils;

/**
 * Created by Alex on 2/10/2017.
 *
 * Class to represent a person.
 */
public class Person
{
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private String gender;

    /**
     * Constructor.
     * @param firstName Set first name to this String value.
     * @param lastName Set last name to this String value.
     * @param yearOfBirth Set year of birth to this int value.
     * @param gender Set gender to this String value.
     */
    public Person(String firstName, String lastName, int yearOfBirth, String gender)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setYearOfBirth(yearOfBirth);
        setGender(gender);
    }

    /**
     * Accessor method for first name.
     * @return firstName as a String.
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Mutator method for first name.
     * @param name Set firstName to this String value.
     */
    public void setFirstName(String name)
    {
        if (StringUtils.isValidString(name)) this.firstName = StringUtils.capitalizeString(name);
    }

    /**
     * Accessor method for last name.
     * @return lastName as a String.
     */
    public String getLastName()
    {
        return this.lastName;
    }

    /**
     * Mutator method for last name.
     * @param name Set lastName to this String value.
     */
    public void setLastName(String name)
    {
        if (StringUtils.isValidString(name)) this.lastName = StringUtils.capitalizeString(name);
    }

    /**
     * Accessor method for year of birth.
     * @return yearOfBirth as an int.
     */
    public int getYearOfBirth()
    {
        return this.yearOfBirth;
    }

    /**
     * Mutator method for year of birth.
     * @param year Set yearOfBirth to this int value.
     */
    public void setYearOfBirth(int year)
    {
        if (year > 0)
        {
            this.yearOfBirth = year;
        }
    }

    /**
     * Accessor method for gender.
     * @return gender as a String.
     */
    public String getGender()
    {
        return this.gender;
    }

    /**
     * Mutator method for gender.
     * @param gender Set gender to this String value.
     */
    public void setGender(String gender)
    {
        if (StringUtils.isValidString(gender)) this.gender = gender.toLowerCase();
    }

    /**
     * Check the gender and return the third person pronoun.
     * @param gender The gender of Person instance.
     * @return The third person pronoun of the gender.
     */
    public String checkGender(String gender)
    {
        if (gender.equals("female")) return "She";
        else if (gender.equals("male")) return "He";
        else return "It";
    }

    /**
     * Print details of the Person instance.
     */
    public void printDetails()
    {
        System.out.println(getNameAndInstance(this.firstName, this.lastName, getClass().getSimpleName())
                           + ". " + getBirthDetails(checkGender(this.gender), this.yearOfBirth) + ".");
    }

    public String getNameAndInstance(String firstName, String lastName, String classType)
    {
        return firstName + " " + lastName + " is a " + classType;
    }

    public String getBirthDetails(String genderPronoun, int year)
    {
        return genderPronoun + " was born in " + year;
    }

}
