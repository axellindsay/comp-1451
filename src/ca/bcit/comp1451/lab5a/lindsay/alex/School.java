package ca.bcit.comp1451.lab5a.lindsay.alex;

import java.util.HashMap;

/**
 * Created by Alex on 2/11/2017.
 *
 * Class to represent a school.
 */
public class School
{
    private Person president;
    private HashMap<String, Student> students = new HashMap();

    public School()
    {
        president = new Person("Kathy", "Kinloch", 1960, "female");

        Student student1 = new Student("Mark", "Zuckerberg", 1984, "male", "12345678", "computer science", 5.0);
        Student student2 = new Student("Michelle", "Obama", 1964, "female", "98765432", "law", 4.0);
        BCITStudent student3 = new BCITStudent("Markus", "Frind", 1979, "male", "A12345678", "computer science", 2.5, "Downtown");
        BCITStudent student4 = new BCITStudent("Gloria", "Macarenko", 1962, "female", "A88877777", "journalism", 3.5, "Burnaby");

        students.put(student1.getStudentNumber(), student1);
        students.put(student2.getStudentNumber(), student2);
        students.put(student3.getStudentNumber(), student3);
        students.put(student4.getStudentNumber(), student4);

        president.printDetails();
        students.forEach((k, v) -> v.printDetails());
    }
}
