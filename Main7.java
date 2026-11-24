class Animal{
    String name;
    void eat(){
        System.out.println(name + " is eating");
    }
}
class Dog extends Animal{
    String breed;
    void bark(){
        System.out.println(name + " the " + breed + " is barking");
    }
}
class Main7{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "snoopy";
        d.breed = "Golden Retriver";
        System.out.println(d.name);
        System.out.println(d.breed);
        d.eat();
        d.bark();
    }
}

