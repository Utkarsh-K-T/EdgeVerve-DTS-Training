//type casting implicit explicit

public class aTypeCastingInJava{
    public static void main(String[] args) {
       // Implicit Typecasting (Widening Conversion)
       int intValue = 10;
       double doubleValue = intValue; // Implicit typecasting from int to double
       System.out.println("Implicit Typecasting (Widening Conversion):");
       System.out.println("int value: " + intValue);
       System.out.println("double value after implicit typecasting: " + doubleValue);

       // Explicit Typecasting (Narrowing Conversion)
       double doubleValue2 = 10.5;
       int intValue2 = (int) doubleValue2; // Explicit typecasting from double to int
       System.out.println("\nExplicit Typecasting (Narrowing Conversion):");
       System.out.println("double value: " + doubleValue2);
       System.out.println("int value after explicit typecasting: " + intValue2);
    }
}