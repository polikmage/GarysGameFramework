package com.board;

import com.terrain.Terrain;
import com.units.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mara on 26.3.2017.
 */
public class Tile {
private List units;
private Terrain terrain;

    public Tile(Terrain terrain) {
        this.terrain = terrain;
        units = new ArrayList();
    }
    public void addUnits(Unit unit){
        units.add(unit);
    }

    public List getUnits() {
        return units;
    }
}
