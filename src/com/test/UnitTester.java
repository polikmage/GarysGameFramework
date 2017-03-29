package com.test;

import com.units.Unit;

/**
 * Created by mapo0104 on 29.3.2017.
 */
public class UnitTester  {
    public static void setGetTypeProperty(){
        Unit unit = new Unit(1);
        unit.setType("swordsman");
        String getType = unit.getType();
        System.out.println("is unit type swordsman?: " + (getType.equals("swordsman")));
    }
    public static void setGetSpecProperty(){
        Unit unit = new Unit(1);
        //unit.setType("swordsman");
       //String getType = unit.getType();
        unit.setProperty("hitpoints",25);
        Object property = unit.getProperty("hitpoints");
        int hitpoints = (int) property;
        System.out.println("is unit hitpoints 25?: " + (hitpoints==25));
    }

    public static void changingSpecProperty(){
        Unit unit = new Unit(1);
        //unit.setType("swordsman");
        //String getType = unit.getType();
        unit.setProperty("hitpoints",25);
        unit.setProperty("hitpoints",15);
        Object property = unit.getProperty("hitpoints");
        int hitpoints = (int) property;
        System.out.println("is unit hitpoints 15?: " + (hitpoints==15));
    }

    public static void getNonExistentPropertyValue(){
        Unit unit = new Unit(1);
        //unit.setType("swordsman");
        //String getType = unit.getType();
        //unit.setProperty("hitpoints",25);
        try{
        Object property = unit.getProperty("hitpoints");
        }catch (Exception e)
        {
            System.out.println("is unit property null?: " + e.getMessage());
        }
        //int hitpoints = (int) property;
        //System.out.println("is unit property null?: " + (property==null));
    }

    public static void main(String[] args) {
        setGetTypeProperty();
        setGetSpecProperty();
        changingSpecProperty();
        getNonExistentPropertyValue();

    }
}

