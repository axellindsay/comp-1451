package ca.bcit.comp1451.lab5a.lindsay.alex;

import ca.bcit.comp1451.StringUtils;

/**
 * Created by Alex on 2/10/2017.
 *
 * Class to represent a student, extending Person.
 */
public class Student extends Person
{
    private String studentNumber;
    private String major;
    private double gradePointAverage;

    /**
     * Constructor.
     * @param firstName Set first name to this String value.
     * @param lastName Set last name to this String value.
     * @param yearOfBirth Set year of birth to this int value.
     * @param gender Set gender to this String value.
     * @param studentNumber Set student number to this String value.
     * @param major Set major to this String value.
     * @param gpa Set grade point average to this double value.
     */
    public Student(String firstName, String lastName, int yearOfBirth, String gender, String studentNumber, String major, double gpa)
    {
        super(firstName, lastName, yearOfBirth, gender);
        setStudentNumber(studentNumber);
        setMajor(major);
        setGradePointAverage(gpa);
    }
    
    /**
     * Accessor method for student number.
     * @return studentNumber as a String.
     */
    public String getStudentNumber()
    {
        return studentNumber;
    }

    /**
     * Mutator method for student number.
     * @param studentNumber Set studentNumber to this String value.
     */
    public void setStudentNumber(String studentNumber)
    {
        if (StringUtils.isValidString(studentNumber)) this.studentNumber = studentNumber;
    }

    /**
     * Accessor method for major.
     * @return major as a String.
     */
    public String getMajor()
    {
        return major;
    }

    /**
     * Mutator method for major.
     * @param major Set major to this String value.
     */
    public void setMajor(String major)
    {
        if (StringUtils.isValidString(major)) this.major = major;
    }

    /**
     * Accessor method for grade point average.
     * @return gradePointAverage as an int.
     */
    public double getGradePointAverage()
    {
        return gradePointAverage;
    }

    /**
     * Mutator method for grade point average.
     * @param gpa Set gradePointAverage to this int value.
     */
    public void setGradePointAverage(double gpa)
    {
        if (gpa >= 0.0) this.gradePointAverage = gpa;
    }

    /**
     * Print details of the Student instance.
     */
    public void printDetails()
    {
        System.out.println(getStudentAndMajor(getFirstName(), getLastName(), getClass().getSimpleName(), this.major, this.studentNumber)
                           + ". " + getBirthDetails(checkGender(getGender()), getYearOfBirth()) + ".");
    }

    public String getStudentAndMajor(String firstName, String lastName, String classType, String major, String studentNumber)
    {
        return getNameAndInstance(firstName, lastName, classType) + " of " + major +  " (st# " + studentNumber + ")";
    }
}
