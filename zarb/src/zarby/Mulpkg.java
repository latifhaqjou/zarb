package zarby;

public class Mulpkg {
    public static void main(String[] args) {
        int x=1;
        while (x<11) {
            int y=1;
            while (y<11) {
                System.out.print(y+"*"+x+"=" +(x*y)+"\t");
                y++;
            }
            System.out.println("\n");
            x++; 
        }
        
    }

}
