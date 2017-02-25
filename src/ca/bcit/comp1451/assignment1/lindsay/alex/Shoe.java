package ca.bcit.comp1451.assignment1.lindsay.alex;

import java.awt.Color;

/**
 * Created by Alex on 2/25/2017.
 *
 */
public class Shoe extends Item
{
    private Material material;
    private int size;
    private Name designer;
    private ShoeType shoeType;
    private Color color;
    private String description;

    public Shoe(double weightKg, double manufactoringPriceDollars,
                double suggestedRetailPriceDollars, String uniqueId)
    {
        super(weightKg, manufactoringPriceDollars, suggestedRetailPriceDollars, uniqueId);
    }

}
