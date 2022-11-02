class Counter{
int number=0;

public void incByOne(){
    number+=1;
}
public void decByOne(){
    number-=1;
}
public void incByTen(){
    number+=10;
}
public void decByTen(){
    number-=10;
}

public void reset(){
    number=0;
}
public void status(){
    System.out.println(number);
}

public static void main(String[] args){
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    c1.incByTen();
    c1.incByTen();
    c1.incByOne();
    c1.incByOne();
    c1.incByOne();
    c2.decByTen();
    c2.decByTen();
    c2.decByTen();
    c2.decByTen();
    c2.decByOne();
    c2.decByOne();
    c2.decByOne();
    c2.decByOne();
    c2.decByOne();
    c2.decByOne();
    c2.decByOne();
    c1.status();
    c2.status();
}
}