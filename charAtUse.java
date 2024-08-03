public class charAtUse{
    public static boolean palindrome (String word){
        for(int i=0;i!=(word.length()-1-i);i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String word = "racepar";
        System.out.println(palindrome(word));
    }
}