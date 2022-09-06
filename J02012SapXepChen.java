/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02012.sap.xep.chen;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02012SapXepChen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.print("Buoc " + i + ":");
            int[] b = new int[i+1];
            for(int k = 0 ; k < i+1 ; k++){
                b[k] = a[k];
            }
            Arrays.sort(b);
            for(int j = 0 ; j < i+1 ; j++){
                System.out.print(" " + b[j]);
            }
            System.out.println();
        }
    }
    
}
