package agh.cs.lab2;

/**
 * Created by David on 2016-11-11.
 */

public class Position {
    public int x;
    public int y;

    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "("+this.x + "," + this.y + ")";
    }
    public boolean smaller(Position pos){
        if(pos.x >= this.x && pos.y >= this.y)
            return true;
        else return false;
    }
    public boolean larger(Position pos){
        if(this.x >= pos.x && this.y >= pos.y)
            return true;
        else return false;
    }
    @Override
    public boolean equals(Object other){
        if(this == other )
            return true;
        if(other == null)
            return false;
        if(getClass() != other.getClass())
            return false;
        Position object = (Position) other;
        if(this.y != object.x)
            return false;
        if(this.y != object.y)
            return false;
        return true;

    }
    public Position add(Position pos) {
        return new Position(this.x + pos.x, this.y + pos.y);
    }
}
