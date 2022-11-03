/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai4 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {       
        int n = scanner.nextInt();
        int []arr = new int[n];
        nhap(arr, n);
        inArr(arr, n);
    }
    
    public static void nhap(int a[], int n){
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
    }
    
    public static boolean check(int x){
        int d=0,t=0;
        do{       
            if(x%10==2 || x%10==3 || x%10==5 || x%10==7)
                d++;
            x=x/10; 
            t++;
        }while(x>=1);
        if(d==t)
            return true;
        return false;
    }
    
    public static boolean checkSnt(int x){
        if (x<2) return false;
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
    
    public static void inArr(int a[], int n){
        int d=0;
        for(int i=0; i<n; i++){
            if(check(a[i]) && checkSnt(a[i])){
                System.out.print(a[i]+" ");
                d++;
            }                
        }
        if(d==0) 
            System.out.println("NO");
    }
}
