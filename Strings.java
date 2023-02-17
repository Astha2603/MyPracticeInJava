import java.util.*;
public class Strings {
    public static void printLetters(String str) {
        // char arr[]={'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String  name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String firstName = "astha";
        // String lastName = "sharma";
        // String fullName = firstName + " "+ lastName;
        // System.out.println(fullName + " is this");

        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    String Name = "Astha";
    String lastName = "Sharma";
    String fullName = Name + " " + lastName;
    printLetters(fullName);
    }
}
