package ca.bcit.comp1451.lab1b.lindsay.alex;

/**
 * Created by Alex on 2/9/2017.
 *
 * Class to test accessor modifiers.
 */
public class Test
{
    public static void main(String[] args)
    {
        if (args.length != 4) return;

        Person p = new Person(args[0], args[1], Integer.parseInt(args[2]));
        p.x = Double.parseDouble(args[3]);

        System.out.println("First Name: " + p.getFirstName());
        System.out.println("Last Name: " + p.getLastName());
        System.out.println("Year of Birth: " + p.getYearOfBirth());
        System.out.println("x Value: " + p.x);
    }
}
