package java_DSA;

import java.util.*;

// Stack implmentation using Arrays
class stack {
    public int top;
    public int[] arr = new int[10];

    stack() {
        top = -1;

    }

    public void push(int val) {
        if (top == 9) {
            System.out.println("Stack is full You cannot insert a value");
            return;
        }
        top++;
        arr[top] = val;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is alredy empty you cannot pop from stack");
            return;
        }
        arr[top] = 0;
        top--;
    }

    public int top() {
        return arr[top];
    }

    public boolean empty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean full() {
        if (top == 9) {
            return true;
        } else {
            return false;
        }
    }

    public void display() {
        //		cout<<"Your Stack is Like this:- "<<endl;
        System.out.println("Your stack is like this:- ");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }


}

public class Stack_implmentation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack st = new stack();
        System.out.println("Enter how many value you want to insert into stack:- ");
        int x = sc.nextInt();

        while (x > 0) {
            System.out.println("Enter value you want to insert in stack:- ");
            int val = sc.nextInt();
            st.push(val);
            x--;
        }
        st.pop();
        System.out.println("The top element in stack is:- ");
        System.out.println(st.top());
        st.display();


    }

}