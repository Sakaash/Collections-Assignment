package VectorandStack;

import java.util.List;
import java.util.Stack;

public class StackAssignment {
    public static void main(String[] args) {
        // **Basic Stack Operations**
        Stack<Integer> integers = new Stack<>();
        integers.push(10);
        integers.push(20);
        integers.push(30);
        integers.push(40);
        integers.push(50);
        integers.pop();
        System.out.println(integers);
        System.out.println();

        // **Peek and Search in Stack**
        Stack<String> strings = new Stack<>();
        strings.addAll(List.of("first", "second", "third", "fourth"));
        System.out.println(strings.peek());
        System.out.println("Position of second from the top: "+strings.search("second"));
        System.out.println();

        // **Reverse a String using stack**
        String input = "hello";
        String result = "";
        Stack<Character> reverse = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            reverse.add(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            result+=reverse.pop();
        }
        System.out.println(result);
        System.out.println();

        // **Balanced Parentheses**
        String string = "(())";
        System.out.println("Input: "+string+" -> Balanced: "+isBalanced(string));
        System.out.println();

        // **Stack to Array Conversion**
        Stack<Double> doubles = new Stack<>();
        doubles.addAll(List.of(1.1, 2.2, 3.3, 4.4, 5.5));
        Double[] array = doubles.toArray(new Double[0]);
        for (Double element : array) {
            System.out.print(element+" ");
        }
        System.out.println();
        Stack<Double> resultStack = new Stack<>();
        for (Double element : array) {
            resultStack.push(element);
        }
        System.out.println("New Stack: " + resultStack);
    }
    
    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : stack) {
            if(ch == '(') {
                stack.push(ch);
            } else if(ch == ')') {
                if(stack.isEmpty()) 
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
