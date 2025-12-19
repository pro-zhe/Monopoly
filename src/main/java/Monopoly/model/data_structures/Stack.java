package Monopoly.model.data_structures;

import Monopoly.model.Action;

import java.util.EmptyStackException;

public class Stack {
    Action[] stack;
    int size;
    int top;
    public Stack(int size) {
        this.stack = new Action[size];
        stack = new Action[size];
        top = -1;
    }

    public void push(Action action) {
        if (top == size - 1) throw new StackOverflowError();
        stack[++top] = action;
    }
    public Action pop() {
        if (top == -1) throw new EmptyStackException();
        return stack[top--];
    }

    public Action peek() {
        if (top == -1) throw new EmptyStackException();
        return stack[top];
    }

    public void clear(){
        top = -1;
    }
}
