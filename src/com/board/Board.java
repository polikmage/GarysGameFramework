package com.board;

import com.terrain.Terrain;
import com.units.Unit;

import java.util.List;

/**
 * Created by Mara on 26.3.2017.
 */
public class Board {
    private Tile [][] board;
    private int width;
    private int height;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new Tile[width][height];
        populateBoard(); //mozna zavola spis actor Game
    }

    private void populateBoard(){
        for (int i = 0; i< width;i++){
            for (int j = 0; j< height;j++){
                board[i][j] = new Tile(new Terrain());
            }
        }
    }
    public Tile getTile(int X, int Y){
        return board[X][Y];
    }
    public void addUnitToATile(int X, int Y, Unit unit){
        board[X][Y].addUnits(unit);
    }
    public List getUnitsOnATile(int X,int Y){
        return board[X][Y].getUnits();
    }
}
