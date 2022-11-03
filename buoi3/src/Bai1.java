/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n<2){
            System.out.println("nhập lại n>=2:");
            n = scanner.nextInt();
        }
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        dem(arr, n);
    }

    public static void dem(int arr[], int n){
        int d=1,k=1;
        do{
            if(arr[0]==arr[k])
                d++;
            k++;
        } while(k<n);
        System.out.println(arr[0]+" : "+d);

        for(int i=1; i<n; i++){
            d=1;
            if(arr[i]!=arr[0]){
                for(int j=i+1; j<n; j++){
                    if(arr[i]==arr[j]){
                        d++;
                        arr[j]=arr[0];
                    }
                }
                System.out.println(arr[i]+" : "+d);
        }
    }
}
}