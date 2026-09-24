package oops.Inheritance;

public class SingleInheritnace {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        
        dog.sound(dog.name );
        dog.bark();
        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.sound(cat.name);
        cat.meow();
    }

    
}
class Animal{
    String name;
    void sound(String name){
        System.out.println(name + "Animal makes a sound");
    }

    }


class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Cat extends Dog{
    void meow(){
        System.out.println("Cat meows");
    }
}