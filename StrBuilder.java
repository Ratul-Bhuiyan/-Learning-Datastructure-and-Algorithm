public class StrBuilder {
    public static void main(String args[]){
        StringBuilder word = new StringBuilder("");
        for(char i = 'a';i<='z';i++){
            word.append(i);
        }
        System.out.println(word);
    }
}
