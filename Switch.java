import java.util.Scanner;

public class Switch {
//  public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();
//     switch(number){
//       case 1: System.out.println("White sauce pasta");
//       break;
//       case 2:System.out.println("Burger");
//       break;
//       case 3:System.out.println("Momos");
//       break;
//       case 4:System.out.println("Noodles");
//       break;
//       case 5:System.out.println("Manchurian");
//       break;
//       default: System.out.println("none");
//     }
//  } 

//***************SIMPLE CALCULATOR*******************
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     char operator = sc.next().charAt(0);
//     switch(operator){
//         case '+' : System.out.println(a+b);
//         break;
//         case'-' : System.out.println(a-b);
//         break;
//         case'*' : System.out.println(a*b);
//         break;
//         case'/' : System.out.println(a/b);
//         break;
//         case'%' : System.out.println(a%b);
//         break;
//         default : System.out.println("wrong operator");
//     }
// }

//****************WEEK DAYS****************** 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER WEEK NO. (1-7)");
    int week =sc.nextInt();
    switch(week){
        case 1: System.out.println("Monday");
        break;
        case 2: System.out.println("Tuesday");
        break;
        case 3: System.out.println("Wednesday");
        break;
        case 4: System.out.println("Thursday");
        break;
        case 5: System.out.println("Friday");
        break;
        case 6: System.out.println("Saturday");
        break;
        case 7: System.out.println("Friday");
        break;
        default: System.out.println("Choose correct no.");
    }
}
}
