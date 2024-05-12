class Animal
{
    public void walk()
    {
        System.out.println("Animal walks");
    }
}
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Dog Barks");
    }
}

public class bUpDownCasting {
    public static void main(String[] args) {
        Animal animal = new Dog(); // upcasting
        Dog dog = (Dog) animal; // downcasting from Animal to Dog
        animal.walk();
        dog.walk();
        dog.bark();
        //System.out.println(Animmal instanceof cat);
    }
}
