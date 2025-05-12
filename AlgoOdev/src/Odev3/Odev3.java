package Odev3;

public class Odev3 {
    public static int carpı5(int n){
        if (n == 1) {
            return 3;
        }
        return carpı5(n - 1) * 5;
    }
    public static int carpı2(int n) {
        if (n == 1) {
            return 3;
        }
        return carpı2(n - 1) * 2;
    }
    /*
    import java.io.*;

class GFG {

    static void fun(int x)
    {
        if(x > 0)
        {
            fun(--x);
            System.out.print(x + " ");
            fun(--x);
        }
    }

    public static void main (String[] args)
    {
        int a = 4;
        fun(a);
    }
}
0 1 2 0 1 3 2 1
     */
}
