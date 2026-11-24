class Employee {
    String name ;
    double baseSalary ;
    void displayBasicInfo(){
        System.out.println("name:"+name);
        System.out.println("baseSalary:"+baseSalary);
    }
}
class Developer extends Employee{
    String programmingLanguage ;
    void writeCode(){
        System.out.println("programmingLanguage:"+programmingLanguage);
    }
}
class Tester extends Employee{
    String testingTool;
    void runTests(){
        System.out.println("testingTool:"+testingTool);
    }
}
class Main9{
    public static void main(String args[]){
        Developer d = new Developer();
        Tester t = new Tester();
        d.name = "Leelasree";
        d.baseSalary = 100000;
        d.programmingLanguage = "JAVA";
        t.name = "Krishnapriya";
        t.baseSalary = 300000;
        t.testingTool = "TestNG";
        d.displayBasicInfo();
        d.writeCode();
        t.runTests();

    }
}
