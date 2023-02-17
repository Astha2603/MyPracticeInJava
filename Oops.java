import java.util.*;

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);


        BankAccount myAcc = new BankAccount();
        myAcc.username = "Astha Sharma";
       // myAcc.password = "Astha@123";  (shows error bcz password is not accessible as it is private)
       myAcc.setPassword("Astha@123");
     }
 }
 
 class BankAccount{
     public String username;
     private String password;
     public void setPassword(String pwd){
         password = pwd;
     }
 }
 
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color= newColor;
    }
    void setTip(int newTip);{
    tip = newTip;
    }
}

