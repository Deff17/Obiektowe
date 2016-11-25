
package agh.cs.lab2;

import java.util.LinkedList;

/**
 * Created by David on 2016-11-11.
 */

public class CarSystem {
    public static void main(String[] args) {
        HayStack hay = new HayStack(new Position(5,5));
        LinkedList<HayStack> Hay = new LinkedList<HayStack>();
        Hay.add(hay);
        IWorldMap map = new UnboundedMap(Hay);



        try {
            MoveDirection[] directions = new OptionsParser().parse(args);
            map.add(new Car(map, 1, 1));
            map.add(new Car(map, 2, 2));
            map.run(directions);
            System.out.print(map.toString());
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        }


}