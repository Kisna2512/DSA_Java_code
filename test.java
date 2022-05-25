package src;

import java.util.ArrayList;

public class test {

    private static void fun(int[] arr, ArrayList < Integer > v, int ind, int n) {


        if (ind == n) {


            if (v.size() > 0) {
                System.out.println(v);
            }
            return;
        }

        v.add(arr[ind]);
        fun(arr, v, ind + 1, n);
        v.remove(v.size() - 1);

        fun(arr, v, ind + 1, n);


    }
    public static void main(String[] args) {
        int[] arr = {
            3,
            2,
            1
        };
        ArrayList < Integer > v = new ArrayList < > ();
        fun(arr, v, 0, 3);

    }

}