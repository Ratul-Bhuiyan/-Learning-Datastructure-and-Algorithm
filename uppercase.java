public class uppercase {
    public static StringBuilder upperCase(String line){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(line.charAt(0)));
        for(int i =1;i<line.length();i++){
            if(line.charAt(i) == ' ' && i<line.length()-1){
                sb.append(line.charAt(i));
                i++;
                sb.append(Character.toUpperCase(line.charAt(i)));
            }else {
                sb.append(line.charAt(i));
            }
        }
        return sb;
    }
    public static void main(String args[]) {
        String line = "hi, i am ratul";
        System.out.println(upperCase(line));
    }
}
