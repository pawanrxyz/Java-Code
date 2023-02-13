import java.util.Stack;
public class Stack_1 {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Monkey");
        animals.push("Dog");
        animals.push("Horse");
        System.out.println("Stacks"+animals);
        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
    }
}
