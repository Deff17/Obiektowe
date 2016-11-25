package agh.cs.lab2;

/**
 * Created by David on 2016-11-11.
 */
public enum MapDirections {
    North, South, West, East;
    @Override
    public String toString(){
        switch(this){
            case North:
               return "North";
            case South:
                return "South";
            case West:
                return "West";
            case East:
                return "East";
            default:
                return null;

        }
    }
    public MapDirections left(){
        return MapDirections.values()[(this.ordinal()+1)%4];
    }                                                           // values tablica z enumami ordinal element obecnie wybrany
    public MapDirections right(){
        return MapDirections.values()[(this.ordinal()+3)%4];
    }
}
