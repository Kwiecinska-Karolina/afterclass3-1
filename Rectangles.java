class Rectangles{
    int a;
    int b;
    int obwod;
    int pole;
public void status(int a, int b){
    obwod=2*a+2*b;
    pole=a*b;
    System.out.println("Wymiary: "+a+"x"+b+" Obwód: "+obwod+" Pole: "+ pole);
}
public void obw(){
    
}
public static void main(String[] args){
    Rectangles r1=new Rectangles();
    Rectangles r2=new Rectangles();
    r1.status(3,4);
    r2.status(2,7);
}
}