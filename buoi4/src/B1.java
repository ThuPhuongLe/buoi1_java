import java.util.Scanner;
public class B1 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String a;
        char a1;
        int t;
        a = sc.nextLine();
        a = a.toLowerCase();
        for(int i=0; i<a.length(); i++){
            t=1;
            if(a.charAt(i)!=' '){
                for(int j=i+1; j<a.length(); j++){
                        if(a.charAt(i)==a.charAt(j)){
                            t++;   
                        }
                } 
                a1 = a.charAt(i);
                a = a.replace(a.charAt(i), ' ');         
                System.out.println(a1 +"  " + t);
            }
        }
    }
    
    
}
