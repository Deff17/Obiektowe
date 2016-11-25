package agh.cs.lab2;

/**
 * Created by David on 2016-11-16.
 */
public class OptionsParser {

    public static MoveDirection[] parse (String[] arguments){

           MoveDirection dirs[] = new MoveDirection[arguments.length];

           for (int i = 0; i < arguments.length; i++) {


                   switch (arguments[i]) {
                       case "f":
                           dirs[i] = MoveDirection.Forward;
                           break;
                       case "forward":
                           dirs[i] = MoveDirection.Forward;
                           break;
                       case "b":
                           dirs[i] = MoveDirection.Backward;
                           break;
                       case "backward":
                           dirs[i] = MoveDirection.Backward;
                           break;
                       case "l":
                           dirs[i] = MoveDirection.Left;
                           break;
                       case "left":
                           dirs[i] = MoveDirection.Left;
                           break;
                       case "r":
                           dirs[i] = MoveDirection.Right;
                           break;
                       case "right":
                           dirs[i] = MoveDirection.Right;
                           break;
                       default:
                           throw new IllegalArgumentException( "Argument " + arguments[i] + " is incorrect");


                   }

           }
           return dirs;


       }
    }


