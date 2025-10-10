import java.util.*;

public class Strings {
    public static float getShortestPath(String path) {
        int x = 0, y = 0; // start point

        // loop through every character in the path
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i); // current direction

            // Move according to direction
            if (dir == 'S') {
                y--; // move down
            } else if (dir == 'N') {
                y++; // move up
            } else if (dir == 'W') {
                x--; // move left
            } else if (dir == 'E') {
                x++; // move right
            }
        }

        // final coordinates = (x, y)
        int x2 = x * x;
        int y2 = y * y;

        // straight line distance = √(x² + y²)
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
