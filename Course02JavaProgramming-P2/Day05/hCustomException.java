class MyException extends Exception
{
    public MyException(String msg)
    {
        super(msg);
    }
}

public class hCustomException 
{
    public static void main(String[] args) throws MyException
    {
        try
        {
            throw new MyException("This is the exception gnerated by me!");
        }
        catch(Exception e)//MyException e both are correct
        {
            System.out.println(e.getMessage());
        }
    }
}
