package com.units;

import com.user_exception.NoSuchCollectionException;
import com.weapons.Weapon;

import java.util.*;

/**
 * Created by Mara on 26.3.2017.
 */
public class Unit {
    private String type;
    private int id;
    private String name;
    private List weapons;
    private Map properties;

    public Unit(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void addWeapon(Weapon weapon)
    throws NoSuchCollectionException{
        if(weapons == null){
            //throw new NoSuchCollectionException(                    "No weapons list exists");
            weapons = new LinkedList();
        }
        weapons.add(weapon);
    }
    // Contract programming
    public void setProperty(String property,Object value){
        if(properties==null){
            properties = new HashMap();
        }
        properties.put(property,value);
    }
    //Defensive programming
    public Object getProperty(String property)
    throws RuntimeException{
        if(properties==null){
            throw new RuntimeException("No property...");
        }
        Object value = properties.get(property);
        if (value==null){
            throw new RuntimeException("No value for property");
        }
        else{
            return value;
        }
    }

    public List getWeapons() {
        return weapons;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
