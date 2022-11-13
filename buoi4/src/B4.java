import java.util.Scanner;
public class B4 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        s = s.trim();
        s = s.toLowerCase();
  
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)<='9' && s.charAt(i)>='0'){
                s = s.substring(0,i) + s.substring(i+1);
                i--;
            }
        }
        if(s.charAt(s.length()-1)<='9' && s.charAt(s.length()-1)>=0)
            s = s.substring(0,s.length()-1);
        
        int k=1;
        String s1="";
        s1+=Character.toUpperCase(s.charAt(0));
        for(int i=0; i<s.length()-1; i++){   
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                s1 += s.substring(k,i+1);
                s1 += Character.toUpperCase(s.charAt(i+1));
                k=i+2;      
            }
        }
        s1 += s.substring(k);
        
        while(s1.contains("  "))
            s1 = s1.replace("  "," ");
        
        System.out.println(s1);
    }
}
