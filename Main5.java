class Person{
    String name="Leelasree";
    void dispalyPerson(){
        System.out.println(name);
    }
}
class Employee extends Person{
    int Employee_id = 589;
    void displayEmployee(){
        System.out.println(Employee_id);
    }
}
class Manager extends Employee{
    String department ="CSE";
    void displayManager(){
        System.out.println(department);
    }
}
class Main5{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.dispalyPerson();
        m.displayEmployee();
        m.displayManager();
    }
}