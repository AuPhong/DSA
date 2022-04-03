

public class Recursion {
    /* Recursion
    Advantages:
    - easy to read/write
    - easy to debug

    Disadvantages:
    - sometimes slower
    - uses more memory
     */

    public static void main(String[] args) {
        //walk(5);
        //System.out.println(pow(2,7));;
        System.out.println(factorial(7));;
    }

    private static int factorial(int base) {
        if (base<1) return 1;
        return base*factorial(base-1);
    }

    private static int  pow(int base, int exponent) {
        if (exponent<1) return 1;
        return base * pow(base, exponent-1);
    }

    private static void walk(int steps) {
        if (steps < 1) return;
        System.out.println("You take a step!");
        walk(steps-1);
    }




}
