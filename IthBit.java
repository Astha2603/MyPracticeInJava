import java.util.*;
public class IthBit {

    //get ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    //set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    //clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    //update ith bit
    public static int updateIthBit(int n,int i,int newBit) {
        if(newBit == 0){
            return clearIthBit(n, i);
        }
        else{
            return setIthBit(n, i);
        }
    }

    //clear last 'i' bits
    public static int clearIBits(int n , int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    //clear range of bits
    public static int clearIBits(int n,int i,int j){
        int a= ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a|b;
        return n&bitMask;
    }

    //a no. is a power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }

    //count set Bits in a number (how many 1 there)
    public static int countSetBits(int n){
        int count = 0;
        while (n>0){
            if((n&1)!=0){    //check our LSB
                count++;
            }
            n= n>>1;
        }
        return count;
    }

    //fast exponentiation
    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n>0){
            if((n&1)!=0){  // check LSB
                ans = ans*a;

            }
            a=a*a;
            n= n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
       System.out.println(fastExpo(5, 3));
    }
}
