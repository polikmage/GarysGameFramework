package com.units;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mapo0104 on 29.3.2017.
 */
public class UnitGroup {
    private Map<Integer,Unit> units;

    public UnitGroup(List<Unit> unitsIn) {
        units = new HashMap<>();
        for (Unit unit:unitsIn){
        units.put(unit.getId(),unit);
        }
    }
    public void addUnit(Unit unit){
        units.put(unit.getId(),unit);
    }
    public void removeUnitById(int id){
        units.remove(id);
    }
    public Unit getUnitById(int id) {
        //Object o = (Object) id;
        return units.get(id);
    }
    public List<Unit> getUnits(){
        List<Unit> unitsOut = new ArrayList<>();
        unitsOut.addAll(this.units.values());
        return unitsOut;
    }
}
