//User Defined Function
//Method without returning any value
//call the method by invoking object

public class Function {
    // public void studentRank(int marks){
    //     if(marks<=600){
    //         System.out.println("Rank A");
    //     }
    //     else if(marks<=500){
    //         System.out.println("Rank B");
    //     }
    //     else
    //     System.out.println("Rank C");
    // }
    // public static void main(String[] args) {
    //     Function obj = new Function();
    //     obj.studentRank(500);
    // }
    

    //call the method without invoking object
    public static void studentRank(int marks){
    if(marks<=600){
        System.out.println("Rank A");
    }
    else if(marks<=500){
        System.out.println("Rank B");
    }
    else {
    System.out.println("Rank C");
}
}
public static void main(String[] args) {
    studentRank(450);
}
}



