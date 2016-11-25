package agh.cs.lab2;



/**
 * Created by David on 2016-11-16.
 */
public class Car {
    private MapDirections orient;
    private Position position;
    private int unit;
    private IWorldMap map;

    public Car(IWorldMap map, int x, int y){
        this.map = map;
        this.orient = MapDirections.North;
        this.position = new Position(x,y);
    }

    public Car(){
        this.orient = MapDirections.North;
        this.position = new Position(2,2);
    }
    @Override
    public String toString(){
        return this.orient.toString().substring(0,1);
    }

    private Car positionChanged(MoveDirection direction) {
        if (direction == MoveDirection.Forward) {
            unit = -1;
        } else {
            unit = 1;
        }
        switch (this.orient) {
            case East:
                if (this.map.canMoveTo(this.position.add(new Position(-1 * unit, 0))))
                    this.position = this.position.add(new Position(-1 * unit, 0));
                return this;
            case North:
                if (this.map.canMoveTo(this.position.add(new Position(0, -1 * unit))))
                    this.position = this.position.add(new Position(0, -1 * unit));
                return this;
            case South:
                if (this.map.canMoveTo(this.position.add(new Position(0, unit))))
                    this.position = this.position.add(new Position(0, unit));
                return this;
            case West:
                if (this.map.canMoveTo(this.position.add(new Position(unit, 0))))
                    this.position = this.position.add(new Position(unit, 0));
                return this;
            default:
                break;
        }
        return null;
    }

    public Car move(MoveDirection direction){

        if(direction != null){
            switch (direction) {
                case Left:
                    this.orient = this.orient.left();
                    break;
                case Right:
                    this.orient = this.orient.right();
                    break;
                case Forward:
                    return this.positionChanged(direction);
                case Backward:
                    return this.positionChanged(direction);
                default:
                    break;
            }
        }
        return this;

    }
    public Position getPosition(){
        return this.position;
    }
}
