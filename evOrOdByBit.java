public class evOrOdByBit {
    public static void evOrOdOwn(int a){
        if(a<<63 >= 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        //Gerenal Rule 
        if((a&1) == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }  
    }
    public static int fastExpo (int a,int n){
        int ans = 1;
        while(n>0){
        if((n&1) != 0){
            ans *= a; 
        }
        a = a*a;
        n = n>>1;
     }
     return ans;
    }
    public static int setBitCount (int a){
        int count = 0;
        while(a != 0){
        if((a&(1<<0)) != 0){
            count +=1;
        }
       a = a>>1;
     }
     return count;
    }
    public static boolean isPowerOfTwo (int a){
        if((a&(a-1)) == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void clrLstIThBits (int a,int i){
        System.out.println(a&~0<<i);
    }
    public static int updateBit(int a, int i,int upVal){
        a = (a|(1<<i));
        return a&(~(1<<i)+ (upVal<<i));
    }
    public static void clearIThBit(int a,int i){
        int bit = ~(1<<i);
        System.out.println(a&bit);
    }
    public static int getIThBit(int a,int i){
        if((a&(1<<i)) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static void setIThBit(int a,int i){
        System.out.println((a|(1<<i)));
    }
    public static void main(String args[]){
        int a = 16 ;
        evOrOdOwn(a);
        System.out.println(getIThBit(a,2));   
        setIThBit(a,2);
        clearIThBit(a,4);
        System.out.println(updateBit(a,1,1));
        clrLstIThBits(a,3);
        System.out.println(isPowerOfTwo(a));
        System.out.println(setBitCount(15));
        System.out.println(fastExpo(3,5));
    }
}