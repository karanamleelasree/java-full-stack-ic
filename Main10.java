class UniversityMember{
    int memberId = 589 ;
    void checkIn(){
        System.out.println("Member checked in ");
    }
}
class Staff extends UniversityMember{
    String Department = "CSE";
    void attendMeeting(){
        System.out.println(Department);
    }
}
class Professor extends Staff{
    String subject = "JAVA";
    void conductLecture(){
        System.out.println(subject);
    }
}
class AdminOfficer extends Staff{
    String officeRoom = "CSE";
    void processFiles(){
        System.out.println(officeRoom);
    }
}
class Main10{
    public static void main(String args[]){
        Professor  p = new Professor();
        AdminOfficer a = new AdminOfficer();
        p.checkIn();
        a.checkIn();
        p.attendMeeting();
        a.attendMeeting();
    }
}