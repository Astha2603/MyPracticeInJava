public class CountChar {
    public static void main(String[] args) {
        String str = "The best of both worlds";
        int count =0;

        //count each character except space
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= ' ')
            count++;
        }
        //diplays the total no. of char present in the given string 
        System.out.println("Total no. of character in a string : " +count);
    } 
        
    }

