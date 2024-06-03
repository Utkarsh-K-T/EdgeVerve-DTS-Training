public class gStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        
        // Appending strings to StringBuffer
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        
        // Inserting strings at a specific position
        stringBuffer.insert(5, "Java ");
        
        // Replacing characters
        stringBuffer.replace(11, 16, "Program");
        
        // Deleting characters
        stringBuffer.delete(6, 10);
        
        // Displaying the final string
        System.out.println("Final String: " + stringBuffer.toString());
    }
}
