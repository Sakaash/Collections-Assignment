package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapAssignment {
    public static void main(String[] args) {
        // **Basic Map Operations**
        Map<String, Integer> peopleInfo = new HashMap<>();
        peopleInfo.put("Alice", 30);
        peopleInfo.put("Bob", 25);
        peopleInfo.put("Charlie", 35);
        peopleInfo.put("Diana", 28);
        peopleInfo.put("Edward", 40);
        System.out.println("Age: "+peopleInfo.get("Charlie"));
        System.out.println(peopleInfo);
        System.out.println();

        // **Iterate Through a Map**
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("banana", 2);
        fruits.put("apple", 5);
        fruits.put("cherry", 7);
        fruits.put("date", 3);
        Iterator<Map.Entry<String, Integer>> iterator = fruits.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println();

        // **Check and Remove Entries**
        Map<String, Integer> students = new HashMap<>();
        students.put("John", 85);
        students.put("Jane", 92);
        students.put("Tom", 76);
        students.put("Lucy", 89);
        if (students.containsKey("Tom")) {
            students.remove("Tom");
            System.out.println("Removed Tom.");
        } else {
            System.out.println("Tom is not present.");
        }
        System.out.println(students);
        System.out.println();

        // **Count Frequency of Elements**
        String input = "programming";
        countFrequency(input);
        System.out.println();

        // **Merge Two Maps**
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("b", 3);
        map1.put("c", 4);
        HashMap<String, Integer> result = mergeMaps(map1,map2);
        System.out.println("Merged Map: "+result);
    }

    private static void countFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        for (char ch : map.keySet()) {
            System.out.println(ch+": "+map.get(ch));
        }
    }

    private static HashMap<String,Integer> mergeMaps(Map<String,Integer> map1, Map<String,Integer> map2) {
        HashMap<String, Integer> result = new HashMap<>(map1);
        result.putAll(map2);

        return result;
    }
}
