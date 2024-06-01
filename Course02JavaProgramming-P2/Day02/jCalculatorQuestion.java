@FunctionalInterface
interface Calculator
{
    public int calculate(int a, int b);
}

public class jCalculatorQuestion
{
    public static void main(String[] args) 
    {
        Calculator add = 
        (n1, n2) -> 
        {
            return n1+n2;
        };

        Calculator subs = 
        (n1, n2) -> 
        {
            return n1-n2;
        };

        Calculator multi = 
        (n1, n2) -> 
        {
            return n1*n2;
        };

        Calculator divi = 
        (n1, n2) -> 
        {
            return n1/n2;
        };

        int n1 = 3;
        int n2 = 6;

        System.out.println("Add = "+add.calculate(n1, n2));
        System.out.println("Subs = "+subs.calculate(n1, n2));
        System.out.println("Multi= "+multi.calculate(n1, n2));
        System.out.println("Divi = "+divi.calculate(n1, n2));

        Calculator addition = (a, b) -> a + b;
        
        Calculator multiply = (a, b) -> a * b;

        Calculator subtract = (a, b) -> a - b;

        Calculator divide = (a, b) -> a / b;

        System.out.println("Add = "+addition.calculate(n1, n2));
        System.out.println("Subs = "+multiply.calculate(n1, n2));
        System.out.println("Multi= "+subtract.calculate(n1, n2));
        System.out.println("Divi = "+divide.calculate(n1, n2));
    }
}
