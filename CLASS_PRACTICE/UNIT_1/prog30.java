class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class cat extends Animal {
  public void animalSound() {
    System.out.println("The cat says: mew mew");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

public class prog30 {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myCat = new cat();
    Animal myDog = new Dog();

    myAnimal.animalSound();
    myCat.animalSound();
    myDog.animalSound();
  }
}