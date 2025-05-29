package Practical_4;

class Animal {// Animal class(parent)
    void sound() {
        System.out.println("The Animal makes a sound.");
    }

}

class Dog extends Animal { // Dog class (child 1)
    void sound() {
        System.out.println("The Dog barks.");

    }
}

class Cat extends Animal { // Cat class (child 2)
    void sound() {
        System.out.println("The Cat meows.");

    }
}

class Elephant extends Animal { // Elephant class (child 3)
    void sound() {
        System.out.println("The Elephant trumpets.");

    }
}

public class Main {
    public static void main(String[] args) {
        Animal MyAnimal = new Animal(); // Creating object of class Aniaml
        MyAnimal.sound(); // Calling function sound()
        Animal MyDog = new Dog(); // Creating object of class Dog
        MyDog.sound(); // Calling function sound()
        Animal MyCat = new Cat(); // Creating object of class Cat
        MyCat.sound(); // Calling function sound()
        Animal MyElephant = new Elephant(); // Creating object of class Elephant
        MyElephant.sound(); // Calling function sound()
    }

}
