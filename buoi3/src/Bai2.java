/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai2 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {       
        int n = scanner.nextInt();
        int []arr = new int[n];
        mang(arr, n);
        themMang(arr, n);
    }
    
    public static void mang(int arr[], int n){
        arr[0] = scanner.nextInt();
        for(int i=1; i<n; i++){
            arr[i] = scanner.nextInt();
            while(arr[i]<=arr[i-1]){
                System.out.print("Nhập lại số > "+arr[i-1]+" để tạo dãy tăng dần:");
                arr[i] = scanner.nextInt();
            }
        }
    }

    public static void themMang(int []arr, int n){
        int d=0;
        for(int i=0; i<n-1; i++){
            if(arr[i+1]!=arr[i]+1){
                d++;
                for(int j=arr[i]+1; j<arr[i+1]; j++){
                    System.out.print(j+"  ");
                        }
                    }
           }
        if(d==0)
            System.out.println("YES");
    }
}

