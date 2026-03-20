import java.util.HashMap;
import java.util.Map;

public class CountSunday {
    public static int totalSunday(String start,int n) {
        Map<String, Integer> map = new HashMap<>();
        map.put("sun", 0);
        map.put("mon", 1);
        map.put("tue", 2);
        map.put("wed", 3);
        map.put("thu", 4);
        map.put("fri", 5);
        map.put("sat", 6);

        int startDay = map.get(start.toLowerCase());

        int daysToSunday = (7 - startDay) % 7;

        if (daysToSunday >= n) return 0;

        return 1 + (n - daysToSunday - 1) / 7;
    }

    public static void main(String[] args) {
        System.out.println(totalSunday("mon",13));
    }
}
