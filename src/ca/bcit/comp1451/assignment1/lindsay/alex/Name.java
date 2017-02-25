package ca.bcit.comp1451.assignment1.lindsay.alex;

/**
 * Created by Alex on 2/25/2017.
 */
public class Name
{
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName)
    {

    }

    public Name(String firstName, String lastName)
    {

    }

    public Name(String firstName, String middleName, String lastName)
    {

    }

    public String getFullName()
    {
        return "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
