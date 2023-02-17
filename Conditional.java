import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Conditional {

    //*************ADULT OR NOT************* 
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int age = sc.nextInt();
    //     if (age>=18){
    //         System.out.println("Adult: eligible for vote,drive");
    //     }
    //      else{
    //         System.out.println("not adult");
    //      }
    // }

    //************LARGEST OF 2 NOS.************** 
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int number1 = sc.nextInt();
    //     int number2 = sc.nextInt();
    //     if(number1>number2){
    //         System.out.println(number1 + " is greater than "+ number2);
    //     }
    //     else{
    //         System.out.println(number2 +" is greater than "+number1);
    //     }
    // }

    //*********IF A NUMBER IS ODD OR EVEN ***************
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int number = sc.nextInt();
    //     if(number%2==0){
    //         System.out.println("Even");
    //     }
    //     else{
    //         System.out.println("Odd");
    //     }
    // }

    //************INCOME TAX***************
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int income = sc.nextInt();
    //     int tax;
    //     if(income< 500000){
    //         tax=0;
    //     }
    //     else if(income>=500000 && income<1000000){
    //         tax = (int)(income*0.2);
    //     }
    //     else{
    //         tax=(int)(income*0.3);
    //     }
    //     System.out.println("your tax is : " + tax);
    //     }

    //**************LARGEST OF 3 NUMBERS***************** 
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int A = sc.nextInt();
    //     int B = sc.nextInt();
    //     int C = sc.nextInt();
    //     if((A>=B) && (A>=C)){
    //         System.out.println(A + " is the largest number");
    //     }
    //     else if(B>=C){
    //         System.out.println(B + " is the largest number");
    //     }
    //     else{
    //         System.out.println(C + " is the largest number");
    //     }
    // }


    //************TERNARY OPERATOR************ 
    // public static void main(String[] args) {
    //     int number  = 4;
    //     String type =(number%2==0)?"even":"odd";
    //     System.out.println(type);
    // }


    //***************LEAP YEAR OR NOT*****************
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input the year : ");
        int year = sc.nextInt();
        boolean x = (year%4)==0;
        boolean y = (year%100)!= 0;
        boolean z = (year%100==0)&&(year%400==0);

        if(x&&(y||z)){
            System.out.println(year + "is a loop year");
        }
        else{
            System.out.println(year + "is not a loop year");
        }
    }
    }

