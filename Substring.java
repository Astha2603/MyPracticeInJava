import java.util.*;
public class Substring {
    public static String SubString(String str, int si, int ei){
        String substr = " ";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        //substring
        String str = "HelloWorld";
        System.out.println(SubString(str,0,5));
    }
}
