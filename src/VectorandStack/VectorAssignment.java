package VectorandStack;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorAssignment {
    public static void main(String[] args) {
        // **Basic Vector Operations**
        Vector<Integer> numbers = new Vector<>(List.of(10,20,30,40,50));
        System.out.println(numbers.get(2));
        System.out.println(numbers);
        System.out.println();

        // **Iterate and Modify Vector Elements**
        Vector<String> fruits = new Vector<>(List.of("apple", "banana", "cherry", "date", "fig"));
        Enumeration<String> elements = fruits.elements();
        while (elements.hasMoreElements()) {
            System.out.print(elements.nextElement()+ " ");
        }
        fruits.set(fruits.indexOf("cherry"), "cocunut");
        System.out.println();
        System.out.println(fruits);
        System.out.println();

        // **Insert and Remove Elements**
        Vector<Character> characters = new Vector<>(List.of('A', 'B', 'C', 'D', 'E'));
        characters.insertElementAt('X', 2);
        characters.remove(0);
        System.out.println(characters);
        System.out.println();

        // **Check for Element and Vector Size**
        Vector<Double> doubles = new Vector<>();
        for (int i = 0; i < 5; i++) {
            doubles.add(Math.random()*20);
        }
        for (int i = 0; i < args.length; i++) {
            if(doubles.get(i) == 10.5)
                System.out.println("Found at index: " + i);
        }
        System.out.println("Before adding an element: "+doubles.size());
        doubles.add(10.5);
        System.out.println("After adding an element: "+doubles.size());
        System.out.println();

        // **Vector to Array Conversion and Vice Versa**
        Vector<String> colors = new Vector<>(List.of("red", "green", "blue", "yellow"));
        String[] colorArray = colors.toArray(new String[0]);
        for (String string : colorArray) {
            System.out.print(string+" ");
        }
        colors = new Vector<>(Arrays.asList(colorArray));
        System.out.println();
        System.out.println(colors);
    }
}
