import java.util.Scanner;

//************PRINT NUMBER FROM 1 TO N************ 
public class Loops {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     System.out.println("Number is = " + n);
    //     int i = 1;
    //     while(i<=n){
    //         System.out.println(i + " ");
    //         i++;
    //     }
    //     System.out.println();
    // }

    //******************SUM OF FIRST N NATURAL NUMBER************
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int sum = 0;
    //     int i = 1;
    //     while(i<=n){
    //         sum+=i;
    //         i++;
    //     }
    //     System.out.println("Sum is =" + sum);
    // }


    //**************FOR LOOPS********************
    //*****PRINT SQUARE PATTERN*******
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for(int i=1;i<=n;i++){
    //         System.out.println("*");
    //     }
    // }

    //*************REVERSE OF A NUMBER*********** 
    // public static void main(String[] args) {
       
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     while(n>0){
    //         int lastdigit = n%10;
    //         System.out.print(lastdigit + " ");
    //         n=n/10;
    //     }
    //     System.out.println();
    // }

    //*************REVERSE THE GIVEN NUMBER*********** 
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int rev =0;
    //     while(n>0){
    //         int lastdigit = n%10;
    //         rev = (rev*10) + lastdigit;
    //         n = n/10;
    //     }
    //     System.out.println(rev);

    // }


    //**************DO WHILE LOOPS*************** 
    //do{
        //do something
   // }
   //while(condition);
//    public static void main(String[] args) {
//     int counter =1;
//     do{
//         System.out.println("Hello World");
//         counter++;
//     }
//     while(counter<=10);
//    }

//*************KEEPS ENTERING NOS. TILL USER ENTER A MULTIPLE OF 10*************
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     do{
//         System.out.println("enter your numbers : ");
//         int n= sc.nextInt();
//         if(n%10==0){
//             break;             //break is used to exit the loop
//         }
//         System.out.println(n);
//     }
//     while(true);
// }

//*****************Display all nos. entered by user except multiple of 10s*************
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     do{
//         System.out.println("Enter you number : ");
//         int n = sc.nextInt();
//         if(n%10==0){
//             continue;     //continue is used to skip an iteration
//         } 
//         System.out.println("Number was : " + n);
//     }
//     while(true);
// }
// } 

//****************Check if a number is prime or not******************* 
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    if (n==2){
        System.out.println(n + " is a prime number");

    }
    else{
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println(n + " is a prime ");
        }
        else{
            System.out.println(n + " is not a prime");
        }
    }
}
}
    

