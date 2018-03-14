package holding;

public class StackCollision {
    public static void main(String[] args) {
        java.util.Stack<String> stack = new java.util.Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.empty())
            System.out.print(stack.pop() + "    ");
    }
}
