public class Recursion {
    // PRINT NUMBER FROM N TO 1 (DECREASING ORDER)
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n-1);
    }
    // PRINT NUMBER FROM N TO 1 (INCREASING ORDER)
    public static void printInc(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n + " ");
    }
    // PRINT FACTORIAL OF A NUMBER
    public static int fact(int n){
        if(n==0){
            return 1;
        }
         int fn1 = fact(n-1);
         int fn = n*fact(n-1);
         return fn;
    }
    // PRINT SUM OF 'N' NATURAL NUMBERS
    public static int calsum(int n){
        if (n==1){
            return 1;
        }
        int sum1 = calsum(n-1);
        int sn = n + sum1;
        return sn;
    }
    // PRINT Nth FIBONACCI SERIES
    public static int fib(int n){
        if (n==0 || n==1){
            return n;
        }
       int fib1 = fib(n-1);
       int fib2 = fib(n-2);
       int fib = fib1 + fib2;
       return fib; 
    }

    //CHECK IF GIVEN ARRAY IS SORTED OR NOT?
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,5,6,7,8};
System.out.println(isSorted(arr, 0));
    }
}
