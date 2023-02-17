import java.util.*;
public class Compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1.equals(s2)){
            System.out.println("String are equals");
        }
        else{
            System.out.println("String are not equal");
        }
    }
}
