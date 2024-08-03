import java.util.*;
public class test {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("apple");
        StringBuilder ssb = new StringBuilder("mango");
        Scanner sc = new Scanner(System.in);
        ssb.append(sc.next());
        //int a = sb.length();
        System.out.println(ssb.charAt(3));
        if(sb.compareTo(ssb)>0){
            System.out.println(sb + " is bigger"); 
        } else if(sb.compareTo(ssb)<0){
            System.out.println(ssb + "is bigger");
        } else {
            System.out.println("they both are equal");
        }
        ssb.append(24.34);
        System.out.println(ssb);
        sc.close();
        }
    }

