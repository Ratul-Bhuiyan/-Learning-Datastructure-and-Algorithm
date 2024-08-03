public class Recursion {
    public static void congStr(int i,int last,String str){
        //base
        if(i==0){
            System.out.println(str);
            return;
        }
        congStr(i-1,0,str+0);
        if(last == 0){
            congStr(i-1,1,str+1);
        }
    }
    public static void rmvDup(String word,int i,boolean map[],StringBuilder newStr){
        if(i == word.length()){
            System.out.println(newStr);
            return;
        }
        if(map[word.charAt(i) - 'a'] != true){
            map[word.charAt(i)-'a'] = true;
            newStr.append(word.charAt(i));
            rmvDup(word,i+1,map,newStr);
        } else if(map[word.charAt(i) - 'a'] == true){
            rmvDup(word,i+1,map,newStr);
        }
    }
    public static int tiling(int n){
        //base
        if(n == 0 || n == 1){
            return 1;
        }
        //work
        return tiling(n-1) + tiling(n-2);
    }
    public static int optPower(int x,int n){
        if(n == 1){
            return x;
        }
        int half = optPower(x,n/2);
        int halfSqr = half * half;
        if(n%2 != 0){
            halfSqr = x * halfSqr;
        }
        return halfSqr;
    }
    public static int power(int x,int n){
        if(n == 1){
            return x;
        }
        return x * power(x,n-1);
    }
    public static int findKeyCplx(int ar[],int key ,int i){
        if(i == ar.length){
            return -1;
        }
        int found = findKeyCplx(ar,key,i+1);
        if(found == -1 && ar[i] == key){
            found = i;
        }
        return found;
    }
    public static int findLKey(int ar[],int key,int i ){
        if(i == ar.length){
            return -1;
        }
        if(ar[ar.length-1-i] == key){
            return ar.length-1-i;
        }
        return findLKey(ar,key,i+1);
    } 
    // public static int findLKey(int arr[],int key,int i){
    //     int fnd;
    //     if(arr[i] == key){
    //          fnd = i;
    //     }
    //     if(i == arr.length-1){
    //         // return fnd;
    //     }
    //     i++;
    //     return findLKey(arr,key,i);
    // }
    public static int findKey(int arr[],int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        i++;
       return findKey(arr,key,i);
    }
    public static boolean isSorted(int ar[], int i){
        if(i == ar.length-1){
            return true;
        }
        if(ar[i] > ar[i+1]){
            return false;
        }
        i++;
        return isSorted(ar,i);
    }
    public static int fibonachi(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fib = fibonachi(n-1) + fibonachi(n-2);
        return fib;
    }
    public static int sum (int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sum(n-1);
        return sum;
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fn = n * factorial(n-1);
        return fn;
    }
    public static void printDc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printDc(n-1);
        System.out.println(n);
    }
    public static void main (String args[]){
        printDc(10);
        System.out.println(factorial(10));
        System.out.println(sum(5));
        System.out.println(fibonachi(25));
        int array[] = {1,2,6,4,6,5};
        System.out.println(isSorted(array,0));
        System.out.println(findKey(array,6,0));
        System.out.println(findLKey(array,3,0));
        System.out.println(findKeyCplx(array,6,0));
        System.out.println(power(3,2));
        System.out.println(optPower(4,5));
        System.out.println(tiling(3));
        //StringBuilder newStr = new StringBuilder("rrattull");
        String word = "rrrattull";
        rmvDup(word,0,new boolean[26],new StringBuilder(""));
        congStr(5,0,"");
    }
}