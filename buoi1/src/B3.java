
public class B3 {
    public static void main(String[] args){
        int x,z;
        float y;
      // System.out.println("trau nam:"+y);
        //x: trâu lớn, y:trâu nằm, z:trâu già
        //pt1: 5x+3y+z*1/3=100
        //pt2:x+y+z=100  2pt=>14x+8y=200 
        for(x=0;x<15;x++){
            y=(float)((200-14*x)/(8.0));
            z=(int)(100-x-y);
            if(y==(int)(y)){
                System.out.println("Các trường hợp:");
                System.out.println("trâu lớn:"+x);
                System.out.println("trâu năm:"+(int)(y));         
                System.out.println("trâu già:"+z);
                System.out.println("");
            }
        } 
    }
}
