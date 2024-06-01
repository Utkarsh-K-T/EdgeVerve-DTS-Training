/*
Overloading
Compile-time polymorphism is achieved through method overloading. 
Method overloading allows multiple methods to have the same name but different parameter lists within the same class. 
The method to be executed is determined at compile time based on the method signature (number and type of parameters).

Overriding
Runtime polymorphism is achieved through method overriding. 
Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass. 
The method to be executed is determined at runtime based on the actual object's type that invokes the method.
*/

class Animal {
    // Overloaded method
    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    // Overloaded method
    public void makeSound(String soundType) {
        System.out.println("Animal makes sound: " + soundType);
    }
}

class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }

    // Overriding the overloaded makeSound method
    @Override
    public void makeSound(String soundType) {
        System.out.println("Dog makes sound: " + soundType);
    }
}

class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat Meows");
    }

    // Overriding the overloaded makeSound method
    @Override
    public void makeSound(String soundType) {
        System.out.println("Cat makes sound: " + soundType);
    }
}

public class aRevisionOverriding {
    public static void main(String[] args) {
        // Overriding example
        Animal ref = new Dog();
        ref.makeSound(); // Outputs: Dog Barks

        Animal ref2 = new Cat();
        ref2.makeSound(); // Outputs: Cat Meows

        // Overloading example with overridden method
        Animal ref3 = new Dog();
        ref3.makeSound("Growl"); // Outputs: Dog makes sound: Growl

        Animal ref4 = new Cat();
        ref4.makeSound("Hiss"); // Outputs: Cat makes sound: Hiss

        // Calling the original overloaded method from the Animal class
        Animal ref5 = new Animal();
        ref5.makeSound(); // Outputs: Animal makes sound
        ref5.makeSound("Roar"); // Outputs: Animal makes sound: Roar
    }
}