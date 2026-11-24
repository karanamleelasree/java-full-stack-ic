class Shape {
    String color="Blue";
    void displayColor(){
        System.out.println(color);
    }
}
class Circle extends Shape{
    double r=5.5;
    double calculateArea(){
        return 3.14*r*r;
    }
}
class Rectangle extends Shape{
    int length = 10;
    int width =20;
    int calculateArea(){
        return length*width;
    }
}
class Main4{
    public static void main(String arg[]){
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        c.displayColor();
        System.out.println("Circle:"+c.calculateArea());
        r.displayColor();
        System.out.println("Rectangle:"+  r.calculateArea());
    }
}
