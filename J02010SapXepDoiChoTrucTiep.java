/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02010.sap.xep.doi.cho.truc.tiep;

/**
 *
 * @author trantuan
 */
import java.util.*;
public class J02010SapXepDoiChoTrucTiep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++)
            a[i] = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            int key = 1;
            for(int j = i+1 ; j < n; j++){
                if(a[i] > a[j]){
                    int x = a[j];
                    a[j] = a[i];
                    a[i] = x;
                    key = 0;
                }
            }
            if(key == 0) {
                System.out.print("Buoc " + (i+1) +":");
                for(int k = 0 ; k < n ; k++){
                    System.out.print(" " + a[k]);
                }
                System.out.println();
            }
        }
    }
    
}
