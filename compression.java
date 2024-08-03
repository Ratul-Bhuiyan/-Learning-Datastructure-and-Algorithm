public class compression {
    public static StringBuilder compress(String word) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<word.length();i++){
            int count = 1;
            while(i<word.length()-1 && word.charAt(i) == word.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(word.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb;
    }
    public static void main(String args[]){
        String word = "aabbbcccdddddf";
        System.out.println(compress(word));
    }
}
