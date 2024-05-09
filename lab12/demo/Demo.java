package demo;

import stack.Stack;
import stack.StackArrayImpl;

public class Demo {
        public static void main(String[] args) {
            Stack stack = new StackArrayImpl();
            stack.push("A");
            stack.push(5);
            stack.push("Z");
            stack.push("" + "B");
            stack.push("Hello");
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
}
