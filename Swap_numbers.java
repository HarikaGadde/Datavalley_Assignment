import java.io.*;
public class swap_the_numbers {
    public static void main(String[] args) {
        int x = 17;
        int y = 18;

        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("\nAfter swapping :");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
