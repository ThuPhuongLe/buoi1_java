/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai3 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {       
        int n=sc.nextInt();
        int []a = new int[n];
        nhap(a,n);
        tim(a,n);
    }
    
    public static void nhap(int a[], int n){
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
    }
    
    public static void tim(int a[], int n){
        int i=1,d=1,max=1;
        do{
            if(a[i]>=a[i-1])
                d++;             
            if((a[i]<a[i-1] && d>=2) || (a[i]>=a[i-1] && i==n-1)){
                if(d>max)
                    max=d;
                d=1;
            }
            i++;
        } while(i<n);
        System.out.println();
        System.out.println(max);
    }
}
