public class dStringBuilderInJava {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings to the StringBuilder
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("world");
        stringBuilder.append("!");

        // Print the StringBuilder content
        System.out.println("StringBuilder content: " + stringBuilder.toString());

        // Inserting at a specific position
        stringBuilder.insert(6, "beautiful ");

        // Print the modified StringBuilder content
        System.out.println("Modified StringBuilder content: " + stringBuilder.toString());

        // Replace characters in the StringBuilder
        stringBuilder.replace(6, 15, "Java");

        // Print the replaced StringBuilder content
        System.out.println("Replaced StringBuilder content: " + stringBuilder.toString());

        // Delete characters from the StringBuilder
        stringBuilder.delete(5, 11);

        // Print the StringBuilder content after deletion
        System.out.println("StringBuilder content after deletion: " + stringBuilder.toString());

        // Reverse the StringBuilder content
        stringBuilder.reverse();

        // Print the reversed StringBuilder content
        System.out.println("Reversed StringBuilder content: " + stringBuilder.toString());
    }
}
