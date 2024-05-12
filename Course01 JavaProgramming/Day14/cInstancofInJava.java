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
class Cat extends Animal
{
    public void meow()
    {
        System.out.println("Cat Meows");
    }
}

public class cInstancofInJava{
    public static void main(String[] args) {
        Animal animal = new Cat();// upcasting
       // Animal animal = new Dog();// upcasting

        if (animal instanceof Dog) 
        {
            Dog dog = (Dog) animal;
            dog.bark();
        }
        else
        {
            Cat cat = (Cat) animal;
            cat.meow() ;
        }
    }
}