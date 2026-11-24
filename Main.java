class Student{
    private String name = "Leelasree";
    private int rollno = 589;
    public void gettername(){
        System.out.println(name);
    }
    public void setter (String s){
        name =s;
    }
    public void getterrollno(){
        System.out.println(rollno);
    }
    public void setter (int r){
        rollno =r;
    }
}
class Main {
    public static void main(String args[]){
        Student c =new Student();
        c.gettername();
        c.setter("Krishnapriya");
        c.gettername();
        c.getterrollno();
        c.setter(590);
        c.getterrollno();
    }
}
