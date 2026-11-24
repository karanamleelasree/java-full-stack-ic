class Vehicle{
    String brand ="Thar";
    void honk(){
        System.out.println("Beep! Beep!");
    }
}
class Car extends Vehicle{
    String modelName = "Mahindra";
    void dispalyDetails(){
        System.out.println(brand);
        System.out.println(modelName);
    }
}
class Main3{
    public static void main(String[] args) {
        Car c = new Car();
        c.honk();
        c.dispalyDetails();
    }
}