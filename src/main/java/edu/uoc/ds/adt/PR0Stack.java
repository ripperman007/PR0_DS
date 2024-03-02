package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {
    public final int CAPACITY = 37;

    private Stack<Double> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<>(CAPACITY);
    }


    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString().replaceAll("\\.0 ", " ").replaceAll("\\.", ",");
    }

    public Stack<Double> getStack() {
        return this.stack;
    }

    public void push(int num) {
        double rounded = Math.sin(Math.toRadians(num)) * 1000.0;
        this.stack.push(Math.round(rounded) / 1000.0);
    }
}
