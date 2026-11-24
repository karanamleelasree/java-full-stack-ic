class Device {
    String powerSource = "on";
    void turnOn(){
        System.out.println("Device powered on ");
    }
}
class Mobile extends Device{
    double screensize = 5674;
    void makeCall(){
        System.out.println(screensize);
    }
}
class Android extends Mobile{
    void openPlayStore(){

    }
}
class Iphone extends Mobile{
    void openAppStore(){

    }
}
class Main6{
    public static void main(String[] args) {
        Android a = new Android();
        Iphone i = new Iphone();
        a.turnOn();
        a.makeCall();
        i.turnOn();
        i.makeCall();
    }
}
