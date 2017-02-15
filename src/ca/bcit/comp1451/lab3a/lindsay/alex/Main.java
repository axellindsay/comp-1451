package ca.bcit.comp1451.lab3a.lindsay.alex;

/**
 * Created by Alex on 2/14/2017.
 *
 * Driver class for the country.
 */
public class Main
{

    public static void main(String[] args)
    {
        String[][] provinces = new String[10][2];

        provinces[0][0] = "ab";
        provinces[1][0] = "bc";
        provinces[2][0] = "mb";
        provinces[3][0] = "nb";
        provinces[4][0] = "nl";
        provinces[5][0] = "ns";
        provinces[6][0] = "on";
        provinces[7][0] = "pe";
        provinces[8][0] = "qc";
        provinces[9][0] = "sk";

        provinces[0][1] = "alberta";
        provinces[1][1] = "british columbia";
        provinces[2][1] = "manitoba";
        provinces[3][1] = "new brunswick";
        provinces[4][1] = "newfoundland";
        provinces[5][1] = "nova scotia";
        provinces[6][1] = "ontario";
        provinces[7][1] = "prince edward island";
        provinces[8][1] = "quebec";
        provinces[9][1] = "saskatchewan";

        Country canada = new Country(provinces);

        canada.createHashMap();
        canada.showAllMappings();
        canada.showAllMappings2();

        System.out.println(canada.doesAnyProvinceContain("alb"));
        System.out.println(canada.doesAnyProvinceContain("e ed"));
        System.out.println(canada.doesAnyProvinceContain("toba"));
        System.out.println(canada.doesAnyProvinceContain("BeC"));
        System.out.println(canada.doesAnyProvinceContain("CHE"));
        System.out.println(canada.doesAnyProvinceContain("aaA"));
        System.out.println(canada.doesAnyProvinceContain("BbB"));
        System.out.println(canada.doesAnyProvinceContain("HeLLo"));
    }

}
