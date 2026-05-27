public class Main {
    public static void main(String[] args) {
        // Test with String
        Box<String> stringBox = new Box<>();    // A Box object holding string items
        stringBox.add("Hello");
        stringBox.add("World");
        System.out.println("String Box size: " + stringBox.size());
        System.out.println("Item at index 0: " + stringBox.get(0));
        System.out.println("Item at index 1: " + stringBox.get(1));


        // Test with Integer
        Box<Integer> intBox = new Box<>();    // A Box object holding integer items
        intBox.add(10);

        intBox.add(12);
        intBox.add(20);
        intBox.add(30);
        System.out.println("\nInteger Box size: " + intBox.size());
        System.out.println("Item at index 1: " + intBox.get(1));
    }
}
