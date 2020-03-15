package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Stack stack = new Stack();
            stack.input();
        }
    }

class Node {
    public int data;
    public Node prev;

    public Node(int data, Node prev) {
        this.data = data;
        this.prev = prev;
    }
}

class Stack {
    private Node top;
    private int size = 0;

    public boolean isEmpty() {
        return (size == 0);
    }

    public void push(int data) throws IllegalAccessException {
        if (!isEmpty()) {
            Node prev = top;
            top = new Node(data, prev);
        } else {
            top = new Node(data, null);
        }
        size++;
        System.out.println("ok");
        input();
    }

    public void pop() throws IllegalAccessException {
        if (isEmpty())
            throw new IllegalAccessException("Список пустой");
        Node save = top;
        top = top.prev;
        System.out.println(save.data);
        size--;
        input();
    }

    public void back() throws IllegalAccessException {
        if (isEmpty())
            throw new IllegalAccessException("Список пустой");
        System.out.println(top.data);
        input();
    }

    public void size() throws IllegalAccessException {
        System.out.println(size);
        input();
    }

    public void clear() throws IllegalAccessException {
        size = 0;
        top = null;
        System.out.println("ok");
        input();
    }

    public void exit() {
        System.out.println("bye");
    }

    public void input() throws IllegalAccessException {
        String commands = new Scanner(System.in).nextLine();
        String[] command = commands.split(" ");
        switch (command[0]) {
            case "push":
                push(Integer.parseInt(command[1]));
                break;
            case "pop":
                pop();
                break;
            case "back":
                back();
                break;
            case "size":
                size();
                break;
            case "clear":
                clear();
                break;
            case "exit":
                exit();
                break;
        }
    }
}
