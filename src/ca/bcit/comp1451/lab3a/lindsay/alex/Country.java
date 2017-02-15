package ca.bcit.comp1451.lab3a.lindsay.alex;

import ca.bcit.comp1451.StringUtils;

import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Map;
        import java.util.Set;

/**
 * Created by Alex on 2/14/2017.
 *
 * Class to represent a country.
 */
public class Country
{
    private String provinces[][];
    private HashMap<String, String> provincesHash = new HashMap<>();

    public Country(String[][] provinces)
    {
        this.provinces = provinces;
    }

    public void createHashMap()
    {
        for (int i = 0; i < this.provinces.length; i++)
        {
            provincesHash.put(this.provinces[i][0], StringUtils.capitalizeString(this.provinces[i][1]));
        }
    }

    public void showAllMappings()
    {
        Set<Map.Entry<String, String>> set = provincesHash.entrySet();

        for (Map.Entry<String, String> p : set)
        {
            System.out.println("The abbreviation " + p.getKey() + " is for the province of " + p.getValue());
        }
    }

    public void showAllMappings2()
    {
        Set<String> keys = provincesHash.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext())
        {
            String province = it.next();
            System.out.println("The province " + provincesHash.get(province) + " has an abbreviation of " + province);
        }
    }

    public boolean doesAnyProvinceContain(String substring)
    {
        Set<Map.Entry<String, String>> set = provincesHash.entrySet();

        for (Map.Entry<String, String> p : set)
        {
            if (p.getValue().toLowerCase().contains(substring.toLowerCase()))
            {
                return true;
            }
        }

        return false;
    }
}