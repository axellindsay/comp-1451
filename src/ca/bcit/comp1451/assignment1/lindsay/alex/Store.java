package ca.bcit.comp1451.assignment1.lindsay.alex;

import ca.bcit.comp1451.StringUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 2/25/2017.
 *
 */
public class Store
{
    private Address streetAddress;
    private String name;
    private Map<String, Item> itemsForSale = new HashMap<String, Item>();

    public Store(Address streetAddress, String name)
    {

    }

    public Address getStreetAddress()
    {
        return streetAddress;
    }

    public void setStreetAddress(Address streetAddress)
    {
        this.streetAddress = streetAddress;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if (StringUtils.isValidString(name))
        {
            this.name = name;
        }
    }

    public void addItem(Item item){
        itemsForSale.put(item.getUniqueID(), item);
    }

    public Item getItemByKey(String key){
        return itemsForSale.get(key);
    }

    public Collection getCollectionOfItems(){
        return itemsForSale.values();
    }
}
