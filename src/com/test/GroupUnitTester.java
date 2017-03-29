package com.test;

import com.units.UnitGroup;
import com.units.Unit;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mapo0104 on 29.3.2017.
 */
public class GroupUnitTester {
    public static  void addUnit(){
        UnitGroup group = new UnitGroup();
        Unit unit = new Unit(1);
        unit.setType("sword");
        Unit unit1 = new Unit(2);
        unit1.setType("tank");

        List insertedUnit = new LinkedList();
        insertedUnit.add(unit);
        insertedUnit.add(unit1);



    }
}
