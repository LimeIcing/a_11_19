import java.util.Map;

public class Main19 {

    /*
    Write a method called rarest that accepts a map whose keys are strings and whose values are integers as a parameter
    and returns the integer value that occurs the fewest times in the map. If there is a tie, return the smaller integer
    value. If the map is empty, throw an exception.
     */

    public static void main(String[] args) {

    }

    public static int rarest(Map<String, Integer> map) {
        if (map.isEmpty()) {
            try {
                throw new Exception("Map cannot be empty.");
            } catch (Exception e) {
                e.getMessage();
            }
        }

        return -1;
    }
}
