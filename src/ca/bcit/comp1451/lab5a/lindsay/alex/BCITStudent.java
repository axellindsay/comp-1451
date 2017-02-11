package ca.bcit.comp1451.lab5a.lindsay.alex;

/**
 * Created by Alex on 2/10/2017.
 *
 * Class to represent a BCIT student, extending Student.
 */
public class BCITStudent extends Student
{
    private String studentNumber;
    private String campus;

    /**
     * Constructor.
     * @param firstName Set first name to this String value.
     * @param lastName Set last name to this String value.
     * @param yearOfBirth Set year of birth to this int value.
     * @param gender Set gender to this String value.
     * @param studentNumber Set student number to this String value.
     * @param major Set major to this String value.
     * @param gpa Set grade point average to this double value.
     * @param campus Set campus to this String value.
     */
    public BCITStudent(String firstName, String lastName, int yearOfBirth,
                       String gender, String studentNumber, String major, double gpa,
                       String campus)
    {
        super(firstName, lastName, yearOfBirth, gender, major, gpa);
        setStudentNumber(studentNumber);
        setCampus(campus);
    }

    /**
     * Accessor method for student number.
     * @return studentNumber as a String.
     */
    public String getStudentNumber()
    {
        return this.studentNumber;
    }

    /**
     * Mutator method for student number.
     * @param studentNumber Set studentNumber to this String value if is in format of "A########".
     */
    public void setStudentNumber(String studentNumber)
    {
        String first = studentNumber.substring(0, 1).toUpperCase();
        String rest = studentNumber.substring(1);
        if (StringUtils.checkString(studentNumber) &&
            studentNumber.length() == 9 &&
            first.equals("A") && StringUtils.isNumeric(rest))
        {
            this.studentNumber = first + rest;
        }
    }

    /**
     * Accessor method for campus.
     * @return campus as a String.
     */
    public String getCampus()
    {
        return this.campus;
    }

    /**
     * Mutator method for campus.
     * @param campus Set campus to this String value if matches one of recognized campuses, else null.
     */
    public void setCampus(String campus)
    {
        switch (campus.trim().toLowerCase())
        {
            case "burnaby":
            {
                this.campus = "Burnaby";
                return;
            }
            case "downtown":
            {
                this.campus = "Downtown";
                return;
            }
            case "richmond":
            {
                this.campus = "Richmond";
                return;
            }
            case "north vancouver":
            {
                this.campus = "North Vancouver";
                return;
            }
            default:
            {
                this.campus = null;
            }
        }
    }

    /**
     * Print details of the BCITStudent instance.
     */
    public void printDetails()
    {
        System.out.println(getBCITStudentAndMajor(getFirstName(), getLastName(), getClass().getSimpleName(), getMajor(),
                           this.studentNumber, this.campus) + ". " +
                           getBirthDetails(checkGender(getGender()), getYearOfBirth()) + ".");
    }

    public String getBCITStudentAndMajor(String firstName, String lastName, String classType, String major, String studentNumber, String campus)
    {
        return getStudentAndMajor(firstName, lastName, classType, major, studentNumber) + " at the " + campus + " campus";
    }
}
