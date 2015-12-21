import java.awt.*;
import java.util.HashSet;


public class TurtleWay {

    public static HashSet<Point> turtlesWay = new HashSet<>();
    public static Point currentPoint = new Point(0,0);


    public static void main(String args[]) {
        int[] arrayOfNumberOfTurtleSteps = {5, 3, 10, 8, 3, 2};
        System.out.print(imitateTurtleWay(arrayOfNumberOfTurtleSteps));


    }

    //get the array of turtle's moves
    //immitate them
    //returns number of iteration when turtle cross it's way
    private static int imitateTurtleWay(int[] arrayOfNumberOfTurtleSteps) {
        boolean stop = false; //flag to stop when turtle crossed its way
        int result=-2; //default value, if method returns -1 - there is no crosses

        for (int i = 0; i < arrayOfNumberOfTurtleSteps.length; i++) {

            //there are 4 possible ways to move: north, east, west, south
            //this part is to choose the direction on each element of array
            if (i % 4 == 0) {
                stop = moveNorth(arrayOfNumberOfTurtleSteps[i]);
                if (stop) {
                    result = i;
                    break;
                }
            } else if (i % 4 == 1) {
                stop = moveEast(arrayOfNumberOfTurtleSteps[i]);
                if (stop) {
                    result = i;
                    break;
                }
            } else if (i % 4 == 2) {
                stop = moveSouth(arrayOfNumberOfTurtleSteps[i]);
                if (stop) {
                    result = i;
                    break;
                }
            } else if (i % 4 == 3) {
                stop = moveWest(arrayOfNumberOfTurtleSteps[i]);
                if (stop) {
                    result = i;
                    break;
                }
            } else {
                System.out.print("Some problems with way directions");
            }
        }


        return result+1;
    }

    private static boolean moveWest(int steps) {
        //get current position
        int x =(int)currentPoint.getX();
        int y =(int)currentPoint.getY();

        for (int i = 0; i < steps; i++){
            //move according to direction
            x--;

            //set new position
            currentPoint = new Point(x,y);

            //add new point to turtleWay
            //if there wasn't that point - keep moving
            //if turtle have been at this point - stop
            if (!turtlesWay.add(currentPoint)) return true;
        }

        return false;
    }

    private static boolean moveSouth(int steps) {
        //get current position
        int x =(int)currentPoint.getX();
        int y =(int)currentPoint.getY();

        for (int i = 0; i < steps; i++){
            //move according to direction
            y++;

            //set new position
            currentPoint = new Point(x,y);

            //add new point to turtleWay
            //if there wasn't that point - keep moving
            //if turtle have been at this point - stop
            if (!turtlesWay.add(currentPoint)) return true;
        }

        return false;
    }


    private static boolean moveEast(int steps) {
        //get current position
        int x =(int)currentPoint.getX();
        int y =(int)currentPoint.getY();

        for (int i = 0; i < steps; i++){
            //move according to direction
            x++;

            //set new position
            currentPoint = new Point(x,y);

            //add new point to turtleWay
            //if there wasn't that point - keep moving
            //if turtle have been at this point - stop
            if (!turtlesWay.add(currentPoint)) return true;
        }

        return false;
    }

    private static boolean moveNorth(int steps) {
        //get current position
        int x =(int)currentPoint.getX();
        int y =(int)currentPoint.getY();

        for (int i = 0; i < steps; i++){
            //move according to direction
            y--;

            //set new position
            currentPoint = new Point(x,y);

            //add new point to turtleWay
            //if there wasn't that point - keep moving
            //if turtle have been at this point - stop
            if (!turtlesWay.add(currentPoint)) return true;
        }

        return false;

    }
}

