class Book{

public void status(int pages, String title, String color, boolean Open){
    if(Open==true){
        System.out.println("Close The Book!");
    }
    else{
        System.out.println("Open The Book!");  
    }
    System.out.println("The book \" "+title+" \" is "+color+" and has "+pages+" pages.");
}
    
public void openTheBook(){
    System.out.println("The book is opened");
}
public void closeTheBook(){
    System.out.println("The book is closed");
}    
public static void main(String[] args){
    Book b1=new Book();
    Book b2= new Book();
    b1.status(1104,"IT","white",true);
    b1.closeTheBook();
    b2.status(368,"It Ends with Us","pink",false);
    b2.openTheBook();
}
}