// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Child class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping.");
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        // Calling methods from all classes
        p.eat();
        p.bark();
        p.weep();
    }
}