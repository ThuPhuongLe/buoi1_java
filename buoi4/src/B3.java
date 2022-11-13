import java.util.Scanner;
public class B3 {   
    public static float check(String s){
        int t=0,d=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<='9' && s.charAt(i)>='0'){
                t+=Integer.parseInt(String.valueOf(s.charAt(i)));
                d++;
            }
        }
        if(d==0) return 0;
        return (float)t/d;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        if(check(s)!=0){
            System.out.println("true");
            System.out.println(Math.round(check(s)*1000.0)/1000.0);
        }
        else System.out.println("false");
    }
}
