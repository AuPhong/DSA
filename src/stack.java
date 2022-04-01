import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Stack = LIFO  data structure. Last-In First-Out
        // stores obj into a sort of "vertical tower"
        // push() to add to the top
        // prop() to remove from the top
        // can run out of memory if push too much elements

        // uses of stacks?
        // 1. undo/redo features in text editors (Ctrl+Z, Ctrl+Y)
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (file directories)
        // 4. calling function (call stack)


        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // return true if stack is empty
        //System.out.println(stack.empty());

        //remove elements from stack
//        stack.pop();

        //assign the top element by variable a and remove it
        //String a = (stack.pop());

        // display all the objs of stack
        //System.out.println(stack);

        // return the top element without removing it
        System.out.println(stack.peek());

        // Search index of element from stack (very last element = 1)
        System.out.println(stack.search("Minecraft"));
        System.out.println(stack.search(stack.peek()));



    }
}
