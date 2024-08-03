public class subString{
    public static String slice(String word,int a,int b){
        String subStr = "";
        if(a>=0 && b<word.length()){
        for(int i=a;i<b;i++){
            subStr += word.charAt(i);
        }
        return subStr;
    } else {
        return "wrong Index";
    }
} 
    public static void main(String args[]){
        String word = "HelloWorld";
        System.out.println(slice(word,3,6));
        System.out.println(word.substring(3,6));
    }
}
