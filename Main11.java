class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Main11{
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 20);
        int sum2 = calc.add(10, 20, 30);

        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
    }
}