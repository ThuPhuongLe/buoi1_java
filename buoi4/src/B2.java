
import java.util.Scanner;

public class B2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0, max = 0;
        String str1;
        String str2;
        str1 = sc.nextLine();
        str2 = sc.nextLine();

        for(int i=0; i<str2.length()-1; i++){
            for(int j=i+1; j<str2.length()+1; j++){
                if(str1.contains(str2.substring(i,j))){
                    t++;
                }                   
            }
            if(t>max)
                max=t;
            t=0;
        }
        System.out.println(max);

        }
    }

