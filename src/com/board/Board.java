package com.board;

import com.terrain.Terrain;
import com.units.Unit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mara on 26.3.2017.
 */
public class Board {
    private List tiles;
    private int width;
    private int height;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        initialize();
    }

    private void initialize(){
        tiles = new ArrayList(width);
        for (int i = 0; i< width;i++){
            tiles.add(i,new ArrayList(height));
            for (int j = 0; j< height;j++){
                ((ArrayList)tiles.get(i)).add(j,new Tile(new Terrain()));
            }
        }
    }
    public Tile getTile(int X, int Y){
        return (Tile) ((ArrayList)tiles.get(X)).get(Y);
    }
    public void addUnitToATile(int X, int Y, Unit unit){
        Tile tile = getTile(X,Y);
        tile.addUnits(unit);
    }
    public List getUnits(int X, int Y){
        Tile tile = getTile(X,Y);
        return tile.getUnits();
    }
    public void removeUnit(Unit unit,int X, int Y){
        Tile tile = getTile(X,Y);
        tile.removeUnit(unit);
    }
    public void removeUnits(int X, int Y){
        Tile tile = getTile(X,Y);
        tile.removeUnits();
    }
}
