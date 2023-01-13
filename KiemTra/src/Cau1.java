import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int t=0;
        int d=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='(')
                t++;
            if(str.charAt(i)==')')
                d++;
        }
        System.out.println(Math.abs(t-d));
    }
}
