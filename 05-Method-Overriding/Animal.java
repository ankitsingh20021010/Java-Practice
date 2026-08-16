
public class Animal {
    void sound(){
        System.out.println("Animal make sound");
    }
    class Dog extends Animal{
    void sound(){
        System.out.println("Dog bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
public static void main(String[] args) {
    Animal a=new Animal();
    a.sound();
    Animal tomy=a.new Dog();
    tomy.sound();
    Animal bella=a.new Cat();
    bella.sound();
}
}
