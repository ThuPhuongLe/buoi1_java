import java.util.Scanner;
public class B2 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      int d = scanner.nextInt();
      int max = a;
      int max2 = 0;
      if(a==b && a==c && a==d){
          System.out.println("Không tồn tại số lớn thứ 2");
    } else {
          if (max<b){
          max=b;
          if(a>=c && a>=d)
              max2=a;
          else if(c>=a && c>=d)
              max2=c;
          else if(d>=a && d>=c)
              max2=d;

      }
    if (max<c){
          max=c;
          if(a>=b && a>=d)
              max2=a;
          if(b>=a && b>=d)
              max2=b;
          if(d>=a && d>=b)
              max2=d;
      }
          
      if (max<d){
          max=d;
          if(a>=c && a>=b)
              max2=a;
          if(b>=a && b>=c)
              max2=b;
          if(c>=a && c>=b)
              max2=c;    
    }
      
      if(max==a){
         if(b>=c && b>=d)
              max2=b;
          if(c>=b && c>=d)
              max2=c;
          if(d>=b && d>=c)
              max2=d; 
      }
      
      if(max2==max){
          if(a<=b && a<=c && a<=d)
              max2=a;
          else if(b<=a && b<=c && b<=d)
              max2=b;
          else max2=c;
      }
      
    System.out.println(max2);
}
}
}
