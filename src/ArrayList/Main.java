package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // **Add and Retrieve Elements**
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Kiwi");
        list.add("Pineapple");
        list.add("Tomato");

        // Print 3rd fruit
        System.out.println(list.get(2));
        System.out.println();

        // **Iterate and Remove Elements**
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (value>30) {
                iterator.remove();
            }
        }
        System.out.println(al);
        System.out.println();

        // **Search for an Element**
        ArrayList<Character> characters = new ArrayList<>();
        char ch = 'a'; 
        for (int i = 0; i < 10; i++) {
            characters.add(ch++);
        }
        System.out.println("Character found at index: "+findCharacter(characters, 'b'));
        System.out.println();

        //  **Sort an ArrayList**
        al.clear();
        for(int i = 0; i<10; i++) {
            al.add((int)(Math.random()*100));
        }
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println();

        // **Convert ArrayList to Array and Vice Versa**
        list.clear();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        String[] arr = list.toArray(new String[0]);
        for (String string : arr) {
            System.out.print(string+" ");
        }
        System.out.println();
        list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }

    private static int findCharacter(List<Character> list, char ch) {
        for (int i = 0; i < list.size(); i++) {
            if((char)list.get(i) == ch) {
                return i;
            }
        }
        return -1;
    }
}
