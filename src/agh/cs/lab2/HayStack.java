package agh.cs.lab2;

/**
 * Created by David on 2016-11-18.
 */
public class HayStack {
    private Position position;

    public HayStack(Position position){
        this.position = position;
    }
    Position getPosition(){
        return this.position;
    }
    public String toString(){
        return "S";
    }
}
