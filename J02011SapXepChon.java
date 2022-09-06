/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02011.sap.xep.chon;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02011SapXepChon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
        for(int i = 0 ; i < n - 1 ; i++){
            System.out.print("Buoc " + (i+1) + " :");
            int min = a[i+1];
            int min_i = i+1;
            for(int j = i + 1 ; j < n ; j++){
                if(a[j] < min){
                    min = a[j];
                    min_i = j;
                }
            }
            if(min < a[i]){
                int t = a[min_i];
                a[min_i] = a[i];
                a[i] = t;
            }
            for(int k = 0 ; k < n ; k++){
                System.out.print(" " + a[k]);
            }
            System.out.println();
        }
    }
    
}
