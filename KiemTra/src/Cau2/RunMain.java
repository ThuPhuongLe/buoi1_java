package Cau2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class RunMain {

    public static Honey[] hn = new Honey[50];

    static int k=0;

    public static void main(String[] args) {
        do{
            System.out.println("Chon 1 trong cac chuc nang:\n"+
                    "1.Add honey\n"+ "2.Show All\n"+"3.Delete\n"+"4.Edit by id\n"+"5.Add favorite by id\n"+"6.Sort by name\n"+"7.Exit");
            int n = new Scanner(System.in).nextInt();
            switch (n){
                case 1:
                    add();
                    break;
                case 2:
                    title();
                    for (int i=0; i<k; i++)
                        hn[i].output();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("lua chon khong hop le!");
            }
        }while (true);
    }

    public static void add(){
        hn[k] = new Honey();
        hn[k].input();
        k++;
    }

    public static void title(){
        System.out.printf("%-10s %-10s %-20s %-10s %-20s %-10s"
                , "id", "status", "ten", "tuoi", "sdt", "gioitinh");
    }
}
