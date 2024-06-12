/*
Checked Exceptions : Direct derived from class
IOException
SQalException
ClassNotFoundException

Unchecked Exception : derived from Runtime mostly due to logicla errors / programming errors!
ArithmeticException
NullPointerException
NumberFormatException
IndexOutOfBoundsException
ArrayIndexOutOfBoundsException
StringIndexOutOfBoundsException
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class eCheckUncheckedException 
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter an integer: ");
            String input = br.readLine();  // This can throw IOException (Checked Exception)
            int a = Integer.parseInt(input);  // This can throw NumberFormatException (Unchecked Exception)
            System.out.println("You entered: " + a);
        } catch (IOException e) {
            // Handling the checked exception IOException
            System.err.println("An IOException occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Handling the unchecked exception NumberFormatException
            System.err.println("Invalid input. Please enter a valid integer.");
        }
    }
}
