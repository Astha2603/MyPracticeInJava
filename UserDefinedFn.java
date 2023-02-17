import javax.lang.model.util.ElementScanner14;

public class UserDefinedFn {
    //create method
    public void studentRank(int marks){
    if(marks>=600){
        System.out.println("Rank A");
    }
    else if (marks>=500){
        System.out.println("Rank B");
    }
    else 
    System.out.println("Rank c");
    }
    public static void main(String[] args) {
       UserDefinedFn obj = new UserDefinedFn();
       obj.studentRank(600); 
    }
    }
    

