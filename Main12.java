class Printer {

    // Prints a String
    void print(String text) {
        System.out.println("Text: " + text);
    }

    // Prints an Integer
    void print(int number) {
        System.out.println("Integer: " + number);
    }

    // Prints a Double
    void print(double decimal) {
        System.out.println("Decimal: " + decimal);
    }
}
public class Main12 {
    public static void main(String[] args) {

        Printer printer = new Printer();

        printer.print("Hello Java");
        printer.print(100);
        printer.print(45.67);
    }
}