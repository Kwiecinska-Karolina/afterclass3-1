class Lamp{
    String status;
    
public void lampStatus(String color){
    System.out.println("Lamp is "+color+" and "+status);
}
public void turnOn(){
    status="on";
    System.out.println("The lamp is on");
}
public void turnOff(){
    status="off";
    System.out.println("The lamp is off");
}
public static void main(String[] args){
    Lamp l1=new Lamp();
    Lamp l2=new Lamp();
    l1.turnOn();
    l2.turnOff();
    l1.lampStatus("pink");
    l2.lampStatus("white");
    
}
}