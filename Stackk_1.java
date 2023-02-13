import java.util.Stack;

public class Stackk_1 {
    public static void main(String[] args) {
        Stack<String>animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack:" +animals);
        System.out.println(animals.peek());
        System.out.println(animals);   
        animals.pop();
        System.out.println(animals);     
        System.out.println(animals.peek());

        animals.push("Monkey");
        System.out.println(animals);
    }
}