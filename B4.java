import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while(a<=0){
            a = scanner.nextInt();
        }
        
        int d=0,t,b=a;
        do{
            d++;
            b/=10;
        } while (b>=1);

        do{
            d--;
            t=a/(int)Math.pow(10,d);
            if(t==Math.pow((int)(Math.sqrt(t)),2)){
                System.out.print(t+"  ");
            }
            a=a%(int)Math.pow(10,d);
        } while (d>0);
    }
}
