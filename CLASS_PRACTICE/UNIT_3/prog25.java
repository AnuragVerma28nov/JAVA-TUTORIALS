// Sealed Classes Example

package UNIT_3;

sealed class Human permits Manish, Vartika, Anuj {
    public void sound() {
        System.out.println("We are Humans.");
    }
}

final class Manish extends Human {
    public void sound() {
        System.out.println("I am Manish.");
    }
}

final class Vartika extends Human {
    public void sound() {
        System.out.println("I am Vartika.");
    }
}

final class Anuj extends Human {
    public void sound() {
        System.out.println("I am Anuj.");
    }
}

public class prog25 {
    public static void main(String[] args) {
        Human obj = new Human();
        Human manish = new Manish();
        Human vartika = new Vartika();
        Human anuj = new Anuj();

        obj.sound();
        manish.sound();
        vartika.sound();
        anuj.sound();
    }
}

// Output:
// We are Humans.
// I am Manish.
// I am Vartika.
// I am Anuj.