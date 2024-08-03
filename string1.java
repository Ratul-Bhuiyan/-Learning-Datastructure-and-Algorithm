public class string1 {
    public static float short_path(String path){
       int x = 0;
       int y = 0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='w'){
                x--;
            }
            else if(path.charAt(i)== 'e'){
                x++;
            }
            else if(path.charAt(i)== 's'){
                y--;
            }
            else {
                y++;
            }
        }
        x *=x;
        y *=y;
        return (float)Math.sqrt(x+y);
    }
    public static void main(String args[]){
        String path = "wwwwwnnnnnnnsewsne";
        System.out.println("Shortest distance is " + short_path(path));

    }
}