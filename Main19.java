import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main19 {

    /*
    Write a method called rarest that accepts a map whose keys are strings and whose values are integers as a parameter
    and returns the integer value that occurs the fewest times in the map. If there is a tie, return the smaller integer
    value. If the map is empty, throw an exception.
     */

    public static void main(String[] args) {
        Map<String, Integer> a = new HashMap<>();
        a.put("FBI", 3);
        a.put("CIA", 3);
        a.put("Homeland Security", 16);
        a.put("NSA", 3);
        a.put("NASA", 4);
        a.put("SHIELD", 6);
        System.out.println(rarest(a));
    }

    public static int rarest(Map<String, Integer> map) {
        if (map.isEmpty()) {
            try {
                throw new Exception("Map cannot be empty.");
            } catch (Exception e) {
                e.getMessage();
            }
        }

        Set<Integer> valueSet = new HashSet<>(map.values());
        int rarest = -1;
        int rarity = 0;

        for (int setValue:valueSet) {
            int counter = 0;

            if (rarest != setValue) {
                for (int mapValue : map.values()) {
                    if (mapValue == setValue) {
                        counter++;
                    }
                }

                if (counter == rarity && setValue < rarest || counter < rarity || rarity == 0) {
                    rarity = counter;
                    rarest = setValue;
                }
            }
        }

        return rarest;
    }
}
