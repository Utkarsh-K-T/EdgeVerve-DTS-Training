

public class hWrapperClass {
    public static void main(String[] args) {
        //Wrapper classes byte boolean integer double float short
        //java.lang
        //autoboxing 
        //unboxing 
        int num =10;
        Integer num1 =num;//auto boxing
        System.out.println(num1);
        
        int num2 = num1;//unboxing;
        System.out.println(num2);

        // Long Wrapper Example
        Long longWrapper = Long.valueOf(1000L);
        long longValue = longWrapper.longValue();
        System.out.println("Long Wrapper: " + longWrapper);
        System.out.println("Long Unboxed Value: " + longValue);

        // Float Wrapper Example
        Float floatWrapper = Float.valueOf(3.14f);
        float floatValue = floatWrapper.floatValue();
        System.out.println("Float Wrapper: " + floatWrapper);
        System.out.println("Float Unboxed Value: " + floatValue);

        // Double Wrapper Example
        Double doubleWrapper = Double.valueOf(2.718);
        double doubleValue = doubleWrapper.doubleValue();
        System.out.println("Double Wrapper: " + doubleWrapper);
        System.out.println("Double Unboxed Value: " + doubleValue);

        // Short Wrapper Example
        Short shortWrapper = Short.valueOf((short) 50);
        short shortValue = shortWrapper.shortValue();
        System.out.println("Short Wrapper: " + shortWrapper);
        System.out.println("Short Unboxed Value: " + shortValue);

        // Byte Wrapper Example
        Byte byteWrapper = Byte.valueOf((byte) 127);
        byte byteValue = byteWrapper.byteValue();
        System.out.println("Byte Wrapper: " + byteWrapper);
        System.out.println("Byte Unboxed Value: " + byteValue);

        // Character Wrapper Example
        Character charWrapper = Character.valueOf('A');
        char charValue = charWrapper.charValue();
        System.out.println("Character Wrapper: " + charWrapper);
        System.out.println("Character Unboxed Value: " + charValue);

        // Boolean Wrapper Example
        Boolean boolWrapper = Boolean.valueOf(true);
        boolean boolValue = boolWrapper.booleanValue();
        System.out.println("Boolean Wrapper: " + boolWrapper);
        System.out.println("Boolean Unboxed Value: " + boolValue);
    }
}
