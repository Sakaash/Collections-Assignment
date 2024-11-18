package ArrayListandLL;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedL {
    public static void main(String[] args) {
        // **Add and Access Elements**
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println("First Element: " + list.get(0) +
                          "\nLast Element: " + list.get(list.size()-1));
        System.out.println();

        // **Iterate and Modify Elements**
        LinkedList<String> ll = new LinkedList<>(List.of("one", "two", "three", "four", "five"));
        ListIterator<String> iterator = ll.listIterator();
        while (iterator.hasNext()) {
            String val = iterator.next();
            if(val.equals("three")) {
                iterator.set("THREE");
            }
        }
        System.out.println(ll);
        System.out.println();

        // **LinkedList Operations**
        list = new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        list.remove(2);
        list.remove(list.size()-1);
        System.out.println(list);
        System.out.println();

        // **Queue Behavior with LinkedList**
        Queue<String> queue = new LinkedList<>(List.of("Alice", "Bob", "Charlie", "Diana"));
        queue.poll();
        queue.poll();
        System.out.println(queue);
        System.out.println();

        // **Reverse LinkedList*
        LinkedList<Character> characters = new LinkedList<>(List.of('1','2','3','4','5'));
        System.out.println("List: " + characters);
        reverseLL(characters);
                System.out.println("Reversed List: " + characters);
        }
        
        private static void reverseLL(LinkedList<Character> list) {
            int left = 0;
            int right = list.size()-1;
            while (left < right) {
                char temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }
    
}