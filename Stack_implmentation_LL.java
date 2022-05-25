package java_DSA;

import java.util.*;

// Stack implmentation using linked list
class Node {
    public int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

}

class stack {
    Node head = null;

    public void push(int val) {

        Node n = new Node(val);
        n.next = head;
        head = n;
        return;



    }

    public void pop() {
        Node temp = head;
        temp = temp.next;
        return;
    }

    public int top() {
        return (head.data);
    }

    public boolean empty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }


}


public class Stack_implmentation_LL {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        stack st = new stack();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.display();
        st.pop();
        System.out.println();
        st.display();
        System.out.println("Top element is :- " + st.top());
        if (!st.empty()) {
            System.out.println("Not empty");
        } else {
            System.out.println("Empty");
        }



    }

}