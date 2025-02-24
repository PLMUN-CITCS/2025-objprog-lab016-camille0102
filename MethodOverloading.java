public class MethodOverloading {

    public static void main(String[] args) {
        // Call the overloaded methods
        printValue(10);         // Calls the printValue(int) method
        printValue(3.14);       // Calls the printValue(double) method
        printValue("Hello!");   // Calls the printValue(String) method
    }

    // Method to print integer value
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Method to print double value
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Method to print String value
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
