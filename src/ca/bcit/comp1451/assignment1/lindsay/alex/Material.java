package ca.bcit.comp1451.assignment1.lindsay.alex;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 2/25/2017.
 */
public enum Material
{
    PLASTIC("plastic"),
    LEATHER("leather"),
    RUBBER("rubber"),
    CLOTH("cloth");

    private String material;

    private static Map<String, Material> lookup = new HashMap<String, Material>();

    static
    {
        for (Material m : Material.values())
        {
            lookup.put(m.getMaterial(), m);
        }
    }

    private Material(String material)
    {
        this.material = material;
    }

    public String getMaterial()
    {
        return this.material;
    }

    public static Material get(String material)
    {
        return lookup.get(material);
    }
}
