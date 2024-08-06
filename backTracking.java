public class backTracking {
    public static void subSet(String str,String ans,int i){
        //base
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            } else {
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //yes choic
        subSet(str,ans+str.charAt(i),i+1);
        //no choice
        subSet(str,ans,i+1);
    }
    public static void main(String args[]){
        String str = "Hello";
        subSet(str,"",0);
    }
}
