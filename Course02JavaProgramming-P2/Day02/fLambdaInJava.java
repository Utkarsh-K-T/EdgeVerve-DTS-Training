/*
Lamda Expressiong - Reduce number of lines in coding
consist () -> {}

can consist arguments (args-list) -> {} 
*/

@FunctionalInterface
interface Student
{
    void study();
}

public class fLambdaInJava {
    public static void main(String[] args) {
        Student ref=()->
        {
            System.out.println("studying");
        };
        //Student ref=()-> System.out.println("studying"); this is also ok as it consist of only one line!
        ref.study();
    }
}
