class Factorial{
    public static void main(String args[]) {

        // Factorial
        int n = 5;
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);

        // Fibonacci Series
        int a = 0, b = 1, c;

        System.out.print("Fibonacci: ");

        for(int i = 1; i <= 10; i++) {
            System.out.print(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}