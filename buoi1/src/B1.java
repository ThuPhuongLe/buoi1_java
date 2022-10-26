
public class B1 {
	public static void main(String[] args) {
		for(int i=1; i<=5;i++){
                    for(int j=1; j<32;j++){
                        if((i==1 || i==3)&&(j==1 || j==7 || j==17 || j==18 || j==19 || j==20 || j==22 || j==23 || j==24 ||j==25) || (i==1)&&(j==12 || j==27 || j==31) || (i==3)&&(j==10 || j==14 || j==29) || (i==2)&&(j==21 || j==26) || (i==5)&&(j==1 || j==7 || j==8 || j==16 || j==17 || j==22 || j==29))
                            System.out.print("*");
                        else if((i==2 || i==4)&&(j==1 || j==7 || j==17 || j==22) || (i==4)&&(j==29))
                            System.out.print("|");
                        else if((i==3)&&(j==2 || j==3 || j==4 || j==5 || j==6 || j==11 || j==12 || j==13))
                            System.out.print("-");
                        else if((i==2)&&(j==11 || j==30) || (i==4)&&(j==9))
                            System.out.print("/");
                        else if((i==2)&&(j==13 || j==28) || (i==4)&&(j==15))
                            System.out.print("\\");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println();
                for(int i=1;i<=5;i++){
                    for(int j=1; j<31; j++){
                        if((i==1 || i==3 || i==5)&&(j==1 || j==5 || j==7 || j==8 || j==9 || j==10 || j==11 || j==12) || (i==1)&&(j==14 || j==22 || j==30) || (i==3)&&(j==3 || j==16 || j==20 || j==24 || j==28) || (i==5)&&(j==18 || j==26))
                            System.out.print("*");
                        else if((i==2 || i==4)&&(j==1 || j==5 || j==7))
                            System.out.print("|");
                        else if((i==2)&&(j==2 || j==15 || j==23) || (i==4)&&(j==4 || j==17 || j==25))
                            System.out.print("\\");
                        else if((i==2)&&(j==21 || j==29) || (i==4)&&(j==19 || j==27))
                            System.out.print("/");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
                System.out.println();
                for(int i=1; i<=5; i++){
                    for(int j=1; j<28; j++){
                        if((i==1 || i==3)&&(j==7 || j==8 || j==9 || j==10 || j==11 || j==12 || j==23 || j==24 || j==25 || j==26) || (i==1)&&(j==1 || j==5 || j==18) || (i==2)&&(j==27) || (i==3)&&(j==3 || j==16 || j==20) || (i==5)&&(j==3 || j==7 || j==8 || j==9 || j==10 || j==11 || j==12 || j==14 || j==22 || j==23 || j==26))
                            System.out.print("*");
                        else if((i==2 || i==4)&&(j==7 || j==23) || (i==4)&&(j==3))
                            System.out.print("|");
                        else if((i==2)&&(j==2 || j==19) || (i==4)&&(j==21 || j==25))
                            System.out.print("\\");
                        else if((i==2)&&(j==4 || j==17 ) || (i==4)&&(j==15))
                            System.out.print("/");
                        else if((i==3)&&(j==17 || j==18 || j==19))
                            System.out.print("-");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
	}
}

