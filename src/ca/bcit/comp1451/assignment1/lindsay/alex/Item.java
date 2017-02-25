package ca.bcit.comp1451.assignment1.lindsay.alex;

import ca.bcit.comp1451.StringUtils;

/**
 * Created by Alex on 2/25/2017.
 *
 */
public class Item
{
    private double weightKg;
    private double manufacturingPriceDollars;
    private double suggestedRetailPriceDollars;
    private String uniqueID;

    public Item(double weightKg, double manufacturingPriceDollars, double suggestedRetailPriceDollars, String uniqueID)
    {
        this.weightKg = weightKg;
        this.manufacturingPriceDollars = manufacturingPriceDollars;
        this.suggestedRetailPriceDollars = suggestedRetailPriceDollars;
        this.uniqueID = uniqueID;
    }

    public double getWeightKg()
    {
        return weightKg;
    }

    public void setWeightKg(double weightKg)
    {
        this.weightKg = weightKg;
    }

    public double getManufacturingPriceDollars()
    {
        return manufacturingPriceDollars;
    }

    public void setManufacturingPriceDollars(double manufacturingPriceDollars)
    {
        this.manufacturingPriceDollars = manufacturingPriceDollars;
    }

    public double getSuggestedRetailPriceDollars()
    {
        return suggestedRetailPriceDollars;
    }

    public void setSuggestedRetailPriceDollars(double suggestedRetailPriceDollars)
    {
        this.suggestedRetailPriceDollars = suggestedRetailPriceDollars;
    }

    public String getUniqueID()
    {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID)
    {
        if (StringUtils.isValidString(uniqueID))
        {
            this.uniqueID = uniqueID;
        }
    }
}
