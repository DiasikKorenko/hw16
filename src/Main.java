import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> mapName = new HashMap<Integer, String>();
        mapName.put(1, "Diana");
        mapName.put(2, "Masha");
        mapName.put(4, "Egor");
        mapName.put(5, "Tima");
        mapName.put(6, "Mixa");
        mapName.put(7, "Olivia");
        mapName.put(8, "Kate");
        mapName.put(9, "Ann");
        mapName.put(10, "Sveta");
        mapName.put(11, "Denis");
        mapName.put(12, "Helen");
        mapName.put(13, "Tony");

        Map<Integer, String> task2 = mapName.entrySet().stream().filter((key -> key.getKey() == 1 || key.getKey() == 2 || key.getKey() == 5 || key.getKey() == 8 || key.getKey() == 9 || key.getKey() == 13)).collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
        task2.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        System.out.println();
        Map<Integer, String> task3 = task2.entrySet().stream().filter(value -> value.getValue().length() % 2 != 0).collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
        task3.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        System.out.println();
        ArrayList<String> valueList = new ArrayList<>(task3.values());
        ArrayList<String> reversedList = new ArrayList<>();
        for (int i = 0; i < valueList.size(); i++) {
            reversedList.add(new StringBuilder(valueList.get(i)).reverse().toString());
        }
        System.out.println(reversedList);
    }
}